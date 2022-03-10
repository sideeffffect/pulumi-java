// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataSourceAclConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceAclConfigurationArgs Empty = new DataSourceAclConfigurationArgs();

    @InputImport(name="allowedGroupsColumnName", required=true)
      private final Input<String> allowedGroupsColumnName;

    public Input<String> getAllowedGroupsColumnName() {
        return this.allowedGroupsColumnName;
    }

    public DataSourceAclConfigurationArgs(Input<String> allowedGroupsColumnName) {
        this.allowedGroupsColumnName = Objects.requireNonNull(allowedGroupsColumnName, "expected parameter 'allowedGroupsColumnName' to be non-null");
    }

    private DataSourceAclConfigurationArgs() {
        this.allowedGroupsColumnName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAclConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> allowedGroupsColumnName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAclConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedGroupsColumnName = defaults.allowedGroupsColumnName;
        }

        public Builder allowedGroupsColumnName(Input<String> allowedGroupsColumnName) {
            this.allowedGroupsColumnName = Objects.requireNonNull(allowedGroupsColumnName);
            return this;
        }

        public Builder allowedGroupsColumnName(String allowedGroupsColumnName) {
            this.allowedGroupsColumnName = Input.of(Objects.requireNonNull(allowedGroupsColumnName));
            return this;
        }
        public DataSourceAclConfigurationArgs build() {
            return new DataSourceAclConfigurationArgs(allowedGroupsColumnName);
        }
    }
}
