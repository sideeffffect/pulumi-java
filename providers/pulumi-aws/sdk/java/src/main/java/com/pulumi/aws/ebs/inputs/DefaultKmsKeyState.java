// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultKmsKeyState extends com.pulumi.resources.ResourceArgs {

    public static final DefaultKmsKeyState Empty = new DefaultKmsKeyState();

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
     * 
     */
    @Import(name="keyArn")
    private @Nullable Output<String> keyArn;

    public Optional<Output<String>> keyArn() {
        return Optional.ofNullable(this.keyArn);
    }

    private DefaultKmsKeyState() {}

    private DefaultKmsKeyState(DefaultKmsKeyState $) {
        this.keyArn = $.keyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultKmsKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultKmsKeyState $;

        public Builder() {
            $ = new DefaultKmsKeyState();
        }

        public Builder(DefaultKmsKeyState defaults) {
            $ = new DefaultKmsKeyState(Objects.requireNonNull(defaults));
        }

        public Builder keyArn(@Nullable Output<String> keyArn) {
            $.keyArn = keyArn;
            return this;
        }

        public Builder keyArn(String keyArn) {
            return keyArn(Output.of(keyArn));
        }

        public DefaultKmsKeyState build() {
            return $;
        }
    }

}
