// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstantRPAdditionalDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstantRPAdditionalDetailsArgs Empty = new InstantRPAdditionalDetailsArgs();

    @Import(name="azureBackupRGNamePrefix")
    private @Nullable Output<String> azureBackupRGNamePrefix;

    public Optional<Output<String>> azureBackupRGNamePrefix() {
        return Optional.ofNullable(this.azureBackupRGNamePrefix);
    }

    @Import(name="azureBackupRGNameSuffix")
    private @Nullable Output<String> azureBackupRGNameSuffix;

    public Optional<Output<String>> azureBackupRGNameSuffix() {
        return Optional.ofNullable(this.azureBackupRGNameSuffix);
    }

    private InstantRPAdditionalDetailsArgs() {}

    private InstantRPAdditionalDetailsArgs(InstantRPAdditionalDetailsArgs $) {
        this.azureBackupRGNamePrefix = $.azureBackupRGNamePrefix;
        this.azureBackupRGNameSuffix = $.azureBackupRGNameSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstantRPAdditionalDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstantRPAdditionalDetailsArgs $;

        public Builder() {
            $ = new InstantRPAdditionalDetailsArgs();
        }

        public Builder(InstantRPAdditionalDetailsArgs defaults) {
            $ = new InstantRPAdditionalDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureBackupRGNamePrefix(@Nullable Output<String> azureBackupRGNamePrefix) {
            $.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
            return this;
        }

        public Builder azureBackupRGNamePrefix(String azureBackupRGNamePrefix) {
            return azureBackupRGNamePrefix(Output.of(azureBackupRGNamePrefix));
        }

        public Builder azureBackupRGNameSuffix(@Nullable Output<String> azureBackupRGNameSuffix) {
            $.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
            return this;
        }

        public Builder azureBackupRGNameSuffix(String azureBackupRGNameSuffix) {
            return azureBackupRGNameSuffix(Output.of(azureBackupRGNameSuffix));
        }

        public InstantRPAdditionalDetailsArgs build() {
            return $;
        }
    }

}
