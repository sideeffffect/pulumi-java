// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTemplateArtifactArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTemplateArtifactArgs Empty = new GetTemplateArtifactArgs();

    /**
     * Name of the blueprint artifact.
     * 
     */
    @InputImport(name="artifactName", required=true)
      private final String artifactName;

    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * Name of the blueprint definition.
     * 
     */
    @InputImport(name="blueprintName", required=true)
      private final String blueprintName;

    public String getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @InputImport(name="resourceScope", required=true)
      private final String resourceScope;

    public String getResourceScope() {
        return this.resourceScope;
    }

    public GetTemplateArtifactArgs(
        String artifactName,
        String blueprintName,
        String resourceScope) {
        this.artifactName = Objects.requireNonNull(artifactName, "expected parameter 'artifactName' to be non-null");
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
    }

    private GetTemplateArtifactArgs() {
        this.artifactName = null;
        this.blueprintName = null;
        this.resourceScope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactName;
        private String blueprintName;
        private String resourceScope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactName = defaults.artifactName;
    	      this.blueprintName = defaults.blueprintName;
    	      this.resourceScope = defaults.resourceScope;
        }

        public Builder artifactName(String artifactName) {
            this.artifactName = Objects.requireNonNull(artifactName);
            return this;
        }

        public Builder blueprintName(String blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }

        public Builder resourceScope(String resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }
        public GetTemplateArtifactArgs build() {
            return new GetTemplateArtifactArgs(artifactName, blueprintName, resourceScope);
        }
    }
}
