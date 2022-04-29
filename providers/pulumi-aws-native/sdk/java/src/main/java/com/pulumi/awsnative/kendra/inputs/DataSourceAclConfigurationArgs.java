// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class DataSourceAclConfigurationArgs extends ResourceArgs {

    public static final DataSourceAclConfigurationArgs Empty = new DataSourceAclConfigurationArgs();

    @Import(name="allowedGroupsColumnName", required=true)
    private Output<String> allowedGroupsColumnName;

    public Output<String> allowedGroupsColumnName() {
        return this.allowedGroupsColumnName;
    }

    private DataSourceAclConfigurationArgs() {}

    private DataSourceAclConfigurationArgs(DataSourceAclConfigurationArgs $) {
        this.allowedGroupsColumnName = $.allowedGroupsColumnName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceAclConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceAclConfigurationArgs $;

        public Builder() {
            $ = new DataSourceAclConfigurationArgs();
        }

        public Builder(DataSourceAclConfigurationArgs defaults) {
            $ = new DataSourceAclConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedGroupsColumnName(Output<String> allowedGroupsColumnName) {
            $.allowedGroupsColumnName = allowedGroupsColumnName;
            return this;
        }

        public Builder allowedGroupsColumnName(String allowedGroupsColumnName) {
            return allowedGroupsColumnName(Output.of(allowedGroupsColumnName));
        }

        public DataSourceAclConfigurationArgs build() {
            $.allowedGroupsColumnName = Objects.requireNonNull($.allowedGroupsColumnName, "expected parameter 'allowedGroupsColumnName' to be non-null");
            return $;
        }
    }

}
