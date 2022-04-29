// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.signer;

import com.pulumi.awsnative.signer.enums.SigningProfilePlatformId;
import com.pulumi.awsnative.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
import com.pulumi.awsnative.signer.inputs.SigningProfileTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningProfileArgs extends ResourceArgs {

    public static final SigningProfileArgs Empty = new SigningProfileArgs();

    /**
     * The ID of the target signing platform.
     * 
     */
    @Import(name="platformId", required=true)
    private Output<SigningProfilePlatformId> platformId;

    /**
     * @return The ID of the target signing platform.
     * 
     */
    public Output<SigningProfilePlatformId> platformId() {
        return this.platformId;
    }

    /**
     * Signature validity period of the profile.
     * 
     */
    @Import(name="signatureValidityPeriod")
    private @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;

    /**
     * @return Signature validity period of the profile.
     * 
     */
    public Optional<Output<SigningProfileSignatureValidityPeriodArgs>> signatureValidityPeriod() {
        return Optional.ofNullable(this.signatureValidityPeriod);
    }

    /**
     * A list of tags associated with the signing profile.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<SigningProfileTagArgs>> tags;

    /**
     * @return A list of tags associated with the signing profile.
     * 
     */
    public Optional<Output<List<SigningProfileTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SigningProfileArgs() {}

    private SigningProfileArgs(SigningProfileArgs $) {
        this.platformId = $.platformId;
        this.signatureValidityPeriod = $.signatureValidityPeriod;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningProfileArgs $;

        public Builder() {
            $ = new SigningProfileArgs();
        }

        public Builder(SigningProfileArgs defaults) {
            $ = new SigningProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param platformId The ID of the target signing platform.
         * 
         * @return builder
         * 
         */
        public Builder platformId(Output<SigningProfilePlatformId> platformId) {
            $.platformId = platformId;
            return this;
        }

        /**
         * @param platformId The ID of the target signing platform.
         * 
         * @return builder
         * 
         */
        public Builder platformId(SigningProfilePlatformId platformId) {
            return platformId(Output.of(platformId));
        }

        /**
         * @param signatureValidityPeriod Signature validity period of the profile.
         * 
         * @return builder
         * 
         */
        public Builder signatureValidityPeriod(@Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod) {
            $.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }

        /**
         * @param signatureValidityPeriod Signature validity period of the profile.
         * 
         * @return builder
         * 
         */
        public Builder signatureValidityPeriod(SigningProfileSignatureValidityPeriodArgs signatureValidityPeriod) {
            return signatureValidityPeriod(Output.of(signatureValidityPeriod));
        }

        /**
         * @param tags A list of tags associated with the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<SigningProfileTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags associated with the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<SigningProfileTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags associated with the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(SigningProfileTagArgs... tags) {
            return tags(List.of(tags));
        }

        public SigningProfileArgs build() {
            $.platformId = Objects.requireNonNull($.platformId, "expected parameter 'platformId' to be non-null");
            return $;
        }
    }

}
