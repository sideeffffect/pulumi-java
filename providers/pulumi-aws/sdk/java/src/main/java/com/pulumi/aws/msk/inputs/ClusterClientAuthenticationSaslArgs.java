// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClientAuthenticationSaslArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClientAuthenticationSaslArgs Empty = new ClusterClientAuthenticationSaslArgs();

    /**
     * Enables IAM client authentication. Defaults to `false`.
     * 
     */
    @Import(name="iam")
    private @Nullable Output<Boolean> iam;

    public Optional<Output<Boolean>> iam() {
        return Optional.ofNullable(this.iam);
    }

    /**
     * Enables SCRAM client authentication via AWS Secrets Manager. Defaults to `false`.
     * 
     */
    @Import(name="scram")
    private @Nullable Output<Boolean> scram;

    public Optional<Output<Boolean>> scram() {
        return Optional.ofNullable(this.scram);
    }

    private ClusterClientAuthenticationSaslArgs() {}

    private ClusterClientAuthenticationSaslArgs(ClusterClientAuthenticationSaslArgs $) {
        this.iam = $.iam;
        this.scram = $.scram;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClientAuthenticationSaslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClientAuthenticationSaslArgs $;

        public Builder() {
            $ = new ClusterClientAuthenticationSaslArgs();
        }

        public Builder(ClusterClientAuthenticationSaslArgs defaults) {
            $ = new ClusterClientAuthenticationSaslArgs(Objects.requireNonNull(defaults));
        }

        public Builder iam(@Nullable Output<Boolean> iam) {
            $.iam = iam;
            return this;
        }

        public Builder iam(Boolean iam) {
            return iam(Output.of(iam));
        }

        public Builder scram(@Nullable Output<Boolean> scram) {
            $.scram = scram;
            return this;
        }

        public Builder scram(Boolean scram) {
            return scram(Output.of(scram));
        }

        public ClusterClientAuthenticationSaslArgs build() {
            return $;
        }
    }

}
