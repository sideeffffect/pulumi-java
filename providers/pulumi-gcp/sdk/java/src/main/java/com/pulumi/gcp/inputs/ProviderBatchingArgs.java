// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderBatchingArgs extends ResourceArgs {

    public static final ProviderBatchingArgs Empty = new ProviderBatchingArgs();

    @Import(name="enableBatching")
    private @Nullable Output<Boolean> enableBatching;

    public Optional<Output<Boolean>> enableBatching() {
        return Optional.ofNullable(this.enableBatching);
    }

    @Import(name="sendAfter")
    private @Nullable Output<String> sendAfter;

    public Optional<Output<String>> sendAfter() {
        return Optional.ofNullable(this.sendAfter);
    }

    private ProviderBatchingArgs() {}

    private ProviderBatchingArgs(ProviderBatchingArgs $) {
        this.enableBatching = $.enableBatching;
        this.sendAfter = $.sendAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderBatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderBatchingArgs $;

        public Builder() {
            $ = new ProviderBatchingArgs();
        }

        public Builder(ProviderBatchingArgs defaults) {
            $ = new ProviderBatchingArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableBatching(@Nullable Output<Boolean> enableBatching) {
            $.enableBatching = enableBatching;
            return this;
        }

        public Builder enableBatching(Boolean enableBatching) {
            return enableBatching(Output.of(enableBatching));
        }

        public Builder sendAfter(@Nullable Output<String> sendAfter) {
            $.sendAfter = sendAfter;
            return this;
        }

        public Builder sendAfter(String sendAfter) {
            return sendAfter(Output.of(sendAfter));
        }

        public ProviderBatchingArgs build() {
            return $;
        }
    }

}
