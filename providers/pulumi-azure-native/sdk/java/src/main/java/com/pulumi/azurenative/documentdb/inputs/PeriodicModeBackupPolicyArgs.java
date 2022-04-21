// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.PeriodicModePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The object representing periodic mode backup policy.
 * 
 */
public final class PeriodicModeBackupPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeriodicModeBackupPolicyArgs Empty = new PeriodicModeBackupPolicyArgs();

    /**
     * Configuration values for periodic mode backup
     * 
     */
    @Import(name="periodicModeProperties")
    private @Nullable Output<PeriodicModePropertiesArgs> periodicModeProperties;

    public Optional<Output<PeriodicModePropertiesArgs>> periodicModeProperties() {
        return Optional.ofNullable(this.periodicModeProperties);
    }

    /**
     * Describes the mode of backups.
     * Expected value is &#39;Periodic&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private PeriodicModeBackupPolicyArgs() {}

    private PeriodicModeBackupPolicyArgs(PeriodicModeBackupPolicyArgs $) {
        this.periodicModeProperties = $.periodicModeProperties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeriodicModeBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeriodicModeBackupPolicyArgs $;

        public Builder() {
            $ = new PeriodicModeBackupPolicyArgs();
        }

        public Builder(PeriodicModeBackupPolicyArgs defaults) {
            $ = new PeriodicModeBackupPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder periodicModeProperties(@Nullable Output<PeriodicModePropertiesArgs> periodicModeProperties) {
            $.periodicModeProperties = periodicModeProperties;
            return this;
        }

        public Builder periodicModeProperties(PeriodicModePropertiesArgs periodicModeProperties) {
            return periodicModeProperties(Output.of(periodicModeProperties));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PeriodicModeBackupPolicyArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
