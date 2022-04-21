// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRoleAssignmentArtifactArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleAssignmentArtifactArgs Empty = new GetRoleAssignmentArtifactArgs();

    /**
     * Name of the blueprint artifact.
     * 
     */
    @Import(name="artifactName", required=true)
    private String artifactName;

    public String artifactName() {
        return this.artifactName;
    }

    /**
     * Name of the blueprint definition.
     * 
     */
    @Import(name="blueprintName", required=true)
    private String blueprintName;

    public String blueprintName() {
        return this.blueprintName;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    @Import(name="resourceScope", required=true)
    private String resourceScope;

    public String resourceScope() {
        return this.resourceScope;
    }

    private GetRoleAssignmentArtifactArgs() {}

    private GetRoleAssignmentArtifactArgs(GetRoleAssignmentArtifactArgs $) {
        this.artifactName = $.artifactName;
        this.blueprintName = $.blueprintName;
        this.resourceScope = $.resourceScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleAssignmentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleAssignmentArtifactArgs $;

        public Builder() {
            $ = new GetRoleAssignmentArtifactArgs();
        }

        public Builder(GetRoleAssignmentArtifactArgs defaults) {
            $ = new GetRoleAssignmentArtifactArgs(Objects.requireNonNull(defaults));
        }

        public Builder artifactName(String artifactName) {
            $.artifactName = artifactName;
            return this;
        }

        public Builder blueprintName(String blueprintName) {
            $.blueprintName = blueprintName;
            return this;
        }

        public Builder resourceScope(String resourceScope) {
            $.resourceScope = resourceScope;
            return this;
        }

        public GetRoleAssignmentArtifactArgs build() {
            $.artifactName = Objects.requireNonNull($.artifactName, "expected parameter 'artifactName' to be non-null");
            $.blueprintName = Objects.requireNonNull($.blueprintName, "expected parameter 'blueprintName' to be non-null");
            $.resourceScope = Objects.requireNonNull($.resourceScope, "expected parameter 'resourceScope' to be non-null");
            return $;
        }
    }

}
