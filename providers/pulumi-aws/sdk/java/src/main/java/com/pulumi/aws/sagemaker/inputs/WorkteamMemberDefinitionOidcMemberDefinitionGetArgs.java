// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkteamMemberDefinitionOidcMemberDefinitionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkteamMemberDefinitionOidcMemberDefinitionGetArgs Empty = new WorkteamMemberDefinitionOidcMemberDefinitionGetArgs();

    /**
     * A list of comma separated strings that identifies user groups in your OIDC IdP. Each user group is made up of a group of private workers.
     * 
     */
    @Import(name="groups", required=true)
    private Output<List<String>> groups;

    public Output<List<String>> groups() {
        return this.groups;
    }

    private WorkteamMemberDefinitionOidcMemberDefinitionGetArgs() {}

    private WorkteamMemberDefinitionOidcMemberDefinitionGetArgs(WorkteamMemberDefinitionOidcMemberDefinitionGetArgs $) {
        this.groups = $.groups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkteamMemberDefinitionOidcMemberDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkteamMemberDefinitionOidcMemberDefinitionGetArgs $;

        public Builder() {
            $ = new WorkteamMemberDefinitionOidcMemberDefinitionGetArgs();
        }

        public Builder(WorkteamMemberDefinitionOidcMemberDefinitionGetArgs defaults) {
            $ = new WorkteamMemberDefinitionOidcMemberDefinitionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder groups(Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        public WorkteamMemberDefinitionOidcMemberDefinitionGetArgs build() {
            $.groups = Objects.requireNonNull($.groups, "expected parameter 'groups' to be non-null");
            return $;
        }
    }

}
