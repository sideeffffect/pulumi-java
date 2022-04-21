// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the SQL Server resource settings.
 * 
 */
public final class SqlServerResourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlServerResourceSettingsArgs Empty = new SqlServerResourceSettingsArgs();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Sql/servers&#39;.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
    private Output<String> targetResourceName;

    public Output<String> targetResourceName() {
        return this.targetResourceName;
    }

    private SqlServerResourceSettingsArgs() {}

    private SqlServerResourceSettingsArgs(SqlServerResourceSettingsArgs $) {
        this.resourceType = $.resourceType;
        this.targetResourceName = $.targetResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerResourceSettingsArgs $;

        public Builder() {
            $ = new SqlServerResourceSettingsArgs();
        }

        public Builder(SqlServerResourceSettingsArgs defaults) {
            $ = new SqlServerResourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder targetResourceName(Output<String> targetResourceName) {
            $.targetResourceName = targetResourceName;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            return targetResourceName(Output.of(targetResourceName));
        }

        public SqlServerResourceSettingsArgs build() {
            $.resourceType = Codegen.stringProp("resourceType").output().arg($.resourceType).require();
            $.targetResourceName = Objects.requireNonNull($.targetResourceName, "expected parameter 'targetResourceName' to be non-null");
            return $;
        }
    }

}
