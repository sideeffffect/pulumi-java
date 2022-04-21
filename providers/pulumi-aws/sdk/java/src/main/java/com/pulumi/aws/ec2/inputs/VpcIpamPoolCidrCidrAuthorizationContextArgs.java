// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcIpamPoolCidrCidrAuthorizationContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolCidrCidrAuthorizationContextArgs Empty = new VpcIpamPoolCidrCidrAuthorizationContextArgs();

    /**
     * The plain-text authorization message for the prefix and account.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The signed authorization message for the prefix and account.
     * 
     */
    @Import(name="signature")
    private @Nullable Output<String> signature;

    public Optional<Output<String>> signature() {
        return Optional.ofNullable(this.signature);
    }

    private VpcIpamPoolCidrCidrAuthorizationContextArgs() {}

    private VpcIpamPoolCidrCidrAuthorizationContextArgs(VpcIpamPoolCidrCidrAuthorizationContextArgs $) {
        this.message = $.message;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcIpamPoolCidrCidrAuthorizationContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcIpamPoolCidrCidrAuthorizationContextArgs $;

        public Builder() {
            $ = new VpcIpamPoolCidrCidrAuthorizationContextArgs();
        }

        public Builder(VpcIpamPoolCidrCidrAuthorizationContextArgs defaults) {
            $ = new VpcIpamPoolCidrCidrAuthorizationContextArgs(Objects.requireNonNull(defaults));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder signature(@Nullable Output<String> signature) {
            $.signature = signature;
            return this;
        }

        public Builder signature(String signature) {
            return signature(Output.of(signature));
        }

        public VpcIpamPoolCidrCidrAuthorizationContextArgs build() {
            return $;
        }
    }

}
