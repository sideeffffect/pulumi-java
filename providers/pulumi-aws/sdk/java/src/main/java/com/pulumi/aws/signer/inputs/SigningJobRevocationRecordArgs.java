// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningJobRevocationRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final SigningJobRevocationRecordArgs Empty = new SigningJobRevocationRecordArgs();

    @Import(name="reason")
    private @Nullable Output<String> reason;

    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    @Import(name="revokedAt")
    private @Nullable Output<String> revokedAt;

    public Optional<Output<String>> revokedAt() {
        return Optional.ofNullable(this.revokedAt);
    }

    @Import(name="revokedBy")
    private @Nullable Output<String> revokedBy;

    public Optional<Output<String>> revokedBy() {
        return Optional.ofNullable(this.revokedBy);
    }

    private SigningJobRevocationRecordArgs() {}

    private SigningJobRevocationRecordArgs(SigningJobRevocationRecordArgs $) {
        this.reason = $.reason;
        this.revokedAt = $.revokedAt;
        this.revokedBy = $.revokedBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningJobRevocationRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningJobRevocationRecordArgs $;

        public Builder() {
            $ = new SigningJobRevocationRecordArgs();
        }

        public Builder(SigningJobRevocationRecordArgs defaults) {
            $ = new SigningJobRevocationRecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public Builder revokedAt(@Nullable Output<String> revokedAt) {
            $.revokedAt = revokedAt;
            return this;
        }

        public Builder revokedAt(String revokedAt) {
            return revokedAt(Output.of(revokedAt));
        }

        public Builder revokedBy(@Nullable Output<String> revokedBy) {
            $.revokedBy = revokedBy;
            return this;
        }

        public Builder revokedBy(String revokedBy) {
            return revokedBy(Output.of(revokedBy));
        }

        public SigningJobRevocationRecordArgs build() {
            return $;
        }
    }

}
