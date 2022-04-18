// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.DetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.DocumentOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.FileOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1BuildDetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1DeploymentDetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1DiscoveryDetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1ImageDetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1IntotoDetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1PackageDetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1VulnerabilityDetailsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.PackageInfoOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.RelationshipOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OccurrenceArgs Empty = new OccurrenceArgs();

    /**
     * Describes an attestation of an artifact.
     * 
     */
    @Import(name="attestation")
      private final @Nullable Output<DetailsArgs> attestation;

    public Output<DetailsArgs> attestation() {
        return this.attestation == null ? Codegen.empty() : this.attestation;
    }

    /**
     * Describes a verifiable build.
     * 
     */
    @Import(name="build")
      private final @Nullable Output<GrafeasV1beta1BuildDetailsArgs> build;

    public Output<GrafeasV1beta1BuildDetailsArgs> build() {
        return this.build == null ? Codegen.empty() : this.build;
    }

    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @Import(name="deployment")
      private final @Nullable Output<GrafeasV1beta1DeploymentDetailsArgs> deployment;

    public Output<GrafeasV1beta1DeploymentDetailsArgs> deployment() {
        return this.deployment == null ? Codegen.empty() : this.deployment;
    }

    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @Import(name="derivedImage")
      private final @Nullable Output<GrafeasV1beta1ImageDetailsArgs> derivedImage;

    public Output<GrafeasV1beta1ImageDetailsArgs> derivedImage() {
        return this.derivedImage == null ? Codegen.empty() : this.derivedImage;
    }

    /**
     * Describes when a resource was discovered.
     * 
     */
    @Import(name="discovered")
      private final @Nullable Output<GrafeasV1beta1DiscoveryDetailsArgs> discovered;

    public Output<GrafeasV1beta1DiscoveryDetailsArgs> discovered() {
        return this.discovered == null ? Codegen.empty() : this.discovered;
    }

    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @Import(name="installation")
      private final @Nullable Output<GrafeasV1beta1PackageDetailsArgs> installation;

    public Output<GrafeasV1beta1PackageDetailsArgs> installation() {
        return this.installation == null ? Codegen.empty() : this.installation;
    }

    /**
     * Describes a specific in-toto link.
     * 
     */
    @Import(name="intoto")
      private final @Nullable Output<GrafeasV1beta1IntotoDetailsArgs> intoto;

    public Output<GrafeasV1beta1IntotoDetailsArgs> intoto() {
        return this.intoto == null ? Codegen.empty() : this.intoto;
    }

    /**
     * Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    @Import(name="noteName", required=true)
      private final Output<String> noteName;

    public Output<String> noteName() {
        return this.noteName;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @Import(name="remediation")
      private final @Nullable Output<String> remediation;

    public Output<String> remediation() {
        return this.remediation == null ? Codegen.empty() : this.remediation;
    }

    /**
     * Immutable. The resource for which the occurrence applies.
     * 
     */
    @Import(name="resource", required=true)
      private final Output<ResourceArgs> resource;

    public Output<ResourceArgs> resource() {
        return this.resource;
    }

    /**
     * Describes a specific software bill of materials document.
     * 
     */
    @Import(name="sbom")
      private final @Nullable Output<DocumentOccurrenceArgs> sbom;

    public Output<DocumentOccurrenceArgs> sbom() {
        return this.sbom == null ? Codegen.empty() : this.sbom;
    }

    /**
     * Describes a specific SPDX File.
     * 
     */
    @Import(name="spdxFile")
      private final @Nullable Output<FileOccurrenceArgs> spdxFile;

    public Output<FileOccurrenceArgs> spdxFile() {
        return this.spdxFile == null ? Codegen.empty() : this.spdxFile;
    }

    /**
     * Describes a specific SPDX Package.
     * 
     */
    @Import(name="spdxPackage")
      private final @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage;

    public Output<PackageInfoOccurrenceArgs> spdxPackage() {
        return this.spdxPackage == null ? Codegen.empty() : this.spdxPackage;
    }

    /**
     * Describes a specific SPDX Relationship.
     * 
     */
    @Import(name="spdxRelationship")
      private final @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship;

    public Output<RelationshipOccurrenceArgs> spdxRelationship() {
        return this.spdxRelationship == null ? Codegen.empty() : this.spdxRelationship;
    }

    /**
     * Describes a security vulnerability.
     * 
     */
    @Import(name="vulnerability")
      private final @Nullable Output<GrafeasV1beta1VulnerabilityDetailsArgs> vulnerability;

    public Output<GrafeasV1beta1VulnerabilityDetailsArgs> vulnerability() {
        return this.vulnerability == null ? Codegen.empty() : this.vulnerability;
    }

    public OccurrenceArgs(
        @Nullable Output<DetailsArgs> attestation,
        @Nullable Output<GrafeasV1beta1BuildDetailsArgs> build,
        @Nullable Output<GrafeasV1beta1DeploymentDetailsArgs> deployment,
        @Nullable Output<GrafeasV1beta1ImageDetailsArgs> derivedImage,
        @Nullable Output<GrafeasV1beta1DiscoveryDetailsArgs> discovered,
        @Nullable Output<GrafeasV1beta1PackageDetailsArgs> installation,
        @Nullable Output<GrafeasV1beta1IntotoDetailsArgs> intoto,
        Output<String> noteName,
        @Nullable Output<String> project,
        @Nullable Output<String> remediation,
        Output<ResourceArgs> resource,
        @Nullable Output<DocumentOccurrenceArgs> sbom,
        @Nullable Output<FileOccurrenceArgs> spdxFile,
        @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage,
        @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship,
        @Nullable Output<GrafeasV1beta1VulnerabilityDetailsArgs> vulnerability) {
        this.attestation = attestation;
        this.build = build;
        this.deployment = deployment;
        this.derivedImage = derivedImage;
        this.discovered = discovered;
        this.installation = installation;
        this.intoto = intoto;
        this.noteName = Objects.requireNonNull(noteName, "expected parameter 'noteName' to be non-null");
        this.project = project;
        this.remediation = remediation;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.sbom = sbom;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.vulnerability = vulnerability;
    }

    private OccurrenceArgs() {
        this.attestation = Codegen.empty();
        this.build = Codegen.empty();
        this.deployment = Codegen.empty();
        this.derivedImage = Codegen.empty();
        this.discovered = Codegen.empty();
        this.installation = Codegen.empty();
        this.intoto = Codegen.empty();
        this.noteName = Codegen.empty();
        this.project = Codegen.empty();
        this.remediation = Codegen.empty();
        this.resource = Codegen.empty();
        this.sbom = Codegen.empty();
        this.spdxFile = Codegen.empty();
        this.spdxPackage = Codegen.empty();
        this.spdxRelationship = Codegen.empty();
        this.vulnerability = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DetailsArgs> attestation;
        private @Nullable Output<GrafeasV1beta1BuildDetailsArgs> build;
        private @Nullable Output<GrafeasV1beta1DeploymentDetailsArgs> deployment;
        private @Nullable Output<GrafeasV1beta1ImageDetailsArgs> derivedImage;
        private @Nullable Output<GrafeasV1beta1DiscoveryDetailsArgs> discovered;
        private @Nullable Output<GrafeasV1beta1PackageDetailsArgs> installation;
        private @Nullable Output<GrafeasV1beta1IntotoDetailsArgs> intoto;
        private Output<String> noteName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> remediation;
        private Output<ResourceArgs> resource;
        private @Nullable Output<DocumentOccurrenceArgs> sbom;
        private @Nullable Output<FileOccurrenceArgs> spdxFile;
        private @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage;
        private @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship;
        private @Nullable Output<GrafeasV1beta1VulnerabilityDetailsArgs> vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.build = defaults.build;
    	      this.deployment = defaults.deployment;
    	      this.derivedImage = defaults.derivedImage;
    	      this.discovered = defaults.discovered;
    	      this.installation = defaults.installation;
    	      this.intoto = defaults.intoto;
    	      this.noteName = defaults.noteName;
    	      this.project = defaults.project;
    	      this.remediation = defaults.remediation;
    	      this.resource = defaults.resource;
    	      this.sbom = defaults.sbom;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder attestation(@Nullable Output<DetailsArgs> attestation) {
            this.attestation = attestation;
            return this;
        }
        public Builder attestation(@Nullable DetailsArgs attestation) {
            this.attestation = Codegen.ofNullable(attestation);
            return this;
        }
        public Builder build(@Nullable Output<GrafeasV1beta1BuildDetailsArgs> build) {
            this.build = build;
            return this;
        }
        public Builder build(@Nullable GrafeasV1beta1BuildDetailsArgs build) {
            this.build = Codegen.ofNullable(build);
            return this;
        }
        public Builder deployment(@Nullable Output<GrafeasV1beta1DeploymentDetailsArgs> deployment) {
            this.deployment = deployment;
            return this;
        }
        public Builder deployment(@Nullable GrafeasV1beta1DeploymentDetailsArgs deployment) {
            this.deployment = Codegen.ofNullable(deployment);
            return this;
        }
        public Builder derivedImage(@Nullable Output<GrafeasV1beta1ImageDetailsArgs> derivedImage) {
            this.derivedImage = derivedImage;
            return this;
        }
        public Builder derivedImage(@Nullable GrafeasV1beta1ImageDetailsArgs derivedImage) {
            this.derivedImage = Codegen.ofNullable(derivedImage);
            return this;
        }
        public Builder discovered(@Nullable Output<GrafeasV1beta1DiscoveryDetailsArgs> discovered) {
            this.discovered = discovered;
            return this;
        }
        public Builder discovered(@Nullable GrafeasV1beta1DiscoveryDetailsArgs discovered) {
            this.discovered = Codegen.ofNullable(discovered);
            return this;
        }
        public Builder installation(@Nullable Output<GrafeasV1beta1PackageDetailsArgs> installation) {
            this.installation = installation;
            return this;
        }
        public Builder installation(@Nullable GrafeasV1beta1PackageDetailsArgs installation) {
            this.installation = Codegen.ofNullable(installation);
            return this;
        }
        public Builder intoto(@Nullable Output<GrafeasV1beta1IntotoDetailsArgs> intoto) {
            this.intoto = intoto;
            return this;
        }
        public Builder intoto(@Nullable GrafeasV1beta1IntotoDetailsArgs intoto) {
            this.intoto = Codegen.ofNullable(intoto);
            return this;
        }
        public Builder noteName(Output<String> noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }
        public Builder noteName(String noteName) {
            this.noteName = Output.of(Objects.requireNonNull(noteName));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder remediation(@Nullable Output<String> remediation) {
            this.remediation = remediation;
            return this;
        }
        public Builder remediation(@Nullable String remediation) {
            this.remediation = Codegen.ofNullable(remediation);
            return this;
        }
        public Builder resource(Output<ResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder resource(ResourceArgs resource) {
            this.resource = Output.of(Objects.requireNonNull(resource));
            return this;
        }
        public Builder sbom(@Nullable Output<DocumentOccurrenceArgs> sbom) {
            this.sbom = sbom;
            return this;
        }
        public Builder sbom(@Nullable DocumentOccurrenceArgs sbom) {
            this.sbom = Codegen.ofNullable(sbom);
            return this;
        }
        public Builder spdxFile(@Nullable Output<FileOccurrenceArgs> spdxFile) {
            this.spdxFile = spdxFile;
            return this;
        }
        public Builder spdxFile(@Nullable FileOccurrenceArgs spdxFile) {
            this.spdxFile = Codegen.ofNullable(spdxFile);
            return this;
        }
        public Builder spdxPackage(@Nullable Output<PackageInfoOccurrenceArgs> spdxPackage) {
            this.spdxPackage = spdxPackage;
            return this;
        }
        public Builder spdxPackage(@Nullable PackageInfoOccurrenceArgs spdxPackage) {
            this.spdxPackage = Codegen.ofNullable(spdxPackage);
            return this;
        }
        public Builder spdxRelationship(@Nullable Output<RelationshipOccurrenceArgs> spdxRelationship) {
            this.spdxRelationship = spdxRelationship;
            return this;
        }
        public Builder spdxRelationship(@Nullable RelationshipOccurrenceArgs spdxRelationship) {
            this.spdxRelationship = Codegen.ofNullable(spdxRelationship);
            return this;
        }
        public Builder vulnerability(@Nullable Output<GrafeasV1beta1VulnerabilityDetailsArgs> vulnerability) {
            this.vulnerability = vulnerability;
            return this;
        }
        public Builder vulnerability(@Nullable GrafeasV1beta1VulnerabilityDetailsArgs vulnerability) {
            this.vulnerability = Codegen.ofNullable(vulnerability);
            return this;
        }        public OccurrenceArgs build() {
            return new OccurrenceArgs(attestation, build, deployment, derivedImage, discovered, installation, intoto, noteName, project, remediation, resource, sbom, spdxFile, spdxPackage, spdxRelationship, vulnerability);
        }
    }
}
