
```drawio-resource
../requirements.drawio
```

An [Ecore](https://www.eclipse.org/modeling/emf/) micro-model of normative statements at the model element level: what must be true, stated where it can be satisfied, verified, and worked on. Defined in [`requirements.xcore`](requirements.xcore). It is the "requirements" floor of the micro-model tower, directly above the [work model](https://work.models.nasdanika.org/) and directly below the [architecture model](https://architecture.models.nasdanika.org/).

The placement is the model's thesis stated twice. Requirements sit **on work** because requirements are worked on: a `Requirement` is `Workable`, so elaboration, implementation, and verification work attach to the requirement itself, and "which work implements requirement X" is containment rather than a tracker link.
Requirements sit **below architecture** because architecture satisfies requirements: the satisfy edge points from design to requirement, so the requirement must already exist on a lower floor.
The architecture model re-parents `AbstractElement` to this floor's `Satisfier`, and every element above - systems, containers, assets, threats' mitigations, agents - can satisfy requirements by inheritance.

## Why a requirements floor

The tower states what exists (architecture), what to do (work), what was chosen and why (decision analysis and binding), and what rules apply (governance) - but nowhere states **what must be true**.
The [capability model](https://capability.models.nasdanika.org/)'s `RequiredCapability` is adjacent but not it: a `RequiredCapability` is a dependency need ("this needs that capability"), not a normative statement with a source, acceptance criteria, satisfaction claims, and verification evidence.

Without this floor the satisfy/verify half of traceability has no home: decisions record why a choice was made, but not what constrained the choice; work records that something was done, but not what condition of satisfaction it discharged; architecture records what is, with no typed way to ask "why must it be this way, and who checked".

## Competitive landscape

**The heavyweight lineage.** RequisitePro's line ended inside IBM DOORS; today's regulated-industry incumbents are IBM DOORS Next, Jama Connect, Siemens Polarion, and PTC Codebeamer - deep, expensive, and each a silo with its own repository, exchanged through ReqIF when exchanged at all.
They own automotive, aerospace, and medical because audits demand them.
This model does not compete for those markets' authoring seat; a ReqIF loader/emitter makes it an exchange peer instead, and the generated-views posture (satisfaction and coverage reports over the whole estate) is precisely what those tools cannot see beyond their own walls.

**Sparx Enterprise Architect and SysML.** The closest structural prior art: EA models requirements as first-class elements with realize links, and SysML fixed the relationship vocabulary - satisfy, derive, verify, refine, trace.
This model deliberately keeps that vocabulary (see the crosswalk below) and drops the rest: no repository product, no diagram tool coupling, requirements as plain typed data in Git next to the architecture they constrain.

**The real competitor, as usual: Word, Excel, Confluence, and Jira.** Most requirements live as shall-statements in documents, rows in matrices, and tickets with "requirement" in the label - untyped, unlinked, satisfaction tracked by hand in a traceability matrix that is stale the week after it is built.
As with the work model, loaders treat those artifacts as source rather than export: Word paragraphs, Excel matrix rows, and Confluence pages load into typed requirements with markers keeping the trace back.

**Requirements-as-code.** Doorstop, StrictDoc, Sphinx-Needs, and OpenFastTrace validate the git-native, review-in-PR approach this model assumes - and stop at text with links.
They have no architecture model to satisfy into, no work model to implement from, no threat model to derive from.
This floor is those tools' idea with a typed estate around it.

**Spec-driven development.** The timing hook. EARS-style shall-statements are back at the center of the industry conversation because coding agents need them: Kiro generates EARS requirements before code, Spec Kit makes the spec the unit of work.
Those specs are markdown files with conventions - ungoverned, unsigned, satisfaction unverifiable.
Here a spec is model data: requirements with acceptance criteria agents consume individually, approval as a signed lifecycle sojourn, satisfaction and verification as queryable records.
Spec-driven development with provenance.

## What a typed model adds

**Satisfaction is a reified, queryable claim.** `Satisfaction` is contained in its satisfier and seen from the requirement via `satisfiedBy` - the architecture model's `Relationship` pattern.
Coverage ("requirements with no satisfier"), suspicion ("satisfactions whose requirement changed"), and honesty ("satisfied but never verified") are queries over the graph, not a matrix maintained by hand.

**Claim and proof are separate.** Satisfaction is asserted by design; `Verification` is a dated record with a fixed-vocabulary method (inspection, analysis, demonstration, test - the one enum, per the `TemporalConstraint` argument), a verdict, and evidence references.
Acceptance criteria are contained records rather than a text blob, so generators and agents consume them one at a time.

**Kinds are data.** `RequirementKind` follows `WorkType` / `ElementKind` / `AssetKind`: functional, quality attribute, constraint, business rule are catalog data, and an ISO 25010 quality taxonomy loads as a kind tree rather than a metamodel release.

**Federation is flow-down.** `RequirementReference` cites a requirement published in another model, so a subsystem derives from - and satisfies - the system's requirements the way code depends on a Maven artifact.
Customer-supplier requirement flow-down without copying, across team and organization boundaries.

**The tower does the rest.** Requirement status (draft, approved, retired) is a [lifecycle](https://lifecycle.models.nasdanika.org/) catalog; approval is a signed sojourn via seal - sign-off rides on the record that needed it; who may see or edit which requirements is IAM; a requirement narrows the decision space, and the binding model's backward execution is literally "requirements in, consistent configuration out".
None of that is modeled here, which is why the model stays micro.

## SysML / DOORS crosswalk

| SysML / DOORS | This model |
|---|---|
| satisfy | `Satisfaction` (reified, in the satisfier) |
| derive | `Requirement.derivedFrom` |
| refine / module hierarchy | containment (`Satisfier.requirements`) |
| verify | `Verification` (+ method, verdict, evidence) |
| trace / source link | `Requirement.sources` |
| requirement type / attributes | `RequirementKind` + properties |
| DOORS partial link | `Satisfaction.partial` |

## Model overview

| Area | Types |
|------|-------|
| Extension point | `Satisfier` (extends work `Workable`; carries `requirements` and `satisfactions`) |
| Kinds | `RequirementKind` (class, instance data) |
| Pattern | `AbstractRequirement`, `Requirement`, `RequirementReference` |
| Acceptance & proof | `AcceptanceCriterion`, `Verification`, `VerificationMethod` (enum, MIL-STD-961/INCOSE) |
| Satisfaction | `Satisfaction` (reified claim, `partial`, `origin`) |
| Root | `RequirementDomain` |

## Relation to other Nasdanika work

The work model supplies `Workable`: requirements are worked on, and the work on a requirement is its implementation trace.
The architecture model re-parents `AbstractElement` to `Satisfier` at the next spine re-wire, making every architecture element a potential satisfier.
The [threat model](https://threat.models.nasdanika.org/) is a requirements factory: a threat begets security requirements (`sources`), and a mitigation is a satisfaction claim awaiting verification. 
The [decision binding model](https://binding.decision.models.nasdanika.org/)'s design-space regions are where requirements constrain choices - a requirement bounds the space, a binding picks the point. 
The capability model's `RequiredCapability` is the ancestor this floor generalizes.
The [governance model](https://governance.models.nasdanika.org/) already declares a thin `Requirement` - the framework clause (reference id, children) inside `Framework`, cited by `Policy.satisfies`. 
This floor's `Requirement` is its **same-name shadow** (the decision binding model's `Alternative` precedent): additive-only, so governance keeps typing against the thin class while a policy can cite a full requirement authored here, and a framework catalog upgrades to verifiable requirements by switching nsURI - EU AI Act articles as a published, federated requirements model that `AISystem`s satisfy.
Integration models follow the work model's naming: `reqif.requirements` for DOORS/Polarion/Jama/Codebeamer exchange, `jira.requirements` mapping requirements to a tracked issue type.

