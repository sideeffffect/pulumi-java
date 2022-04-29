// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketServerSideEncryptionByDefaultSSEAlgorithm;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request doesn&#39;t specify any server-side encryption, this default encryption will be applied.
 * 
 */
public final class BucketServerSideEncryptionByDefaultArgs extends ResourceArgs {

    public static final BucketServerSideEncryptionByDefaultArgs Empty = new BucketServerSideEncryptionByDefaultArgs();

    /**
     * &#34;KMSMasterKeyID&#34; can only be used when you set the value of SSEAlgorithm as aws:kms.
     * 
     */
    @Import(name="kMSMasterKeyID")
    private @Nullable Output<String> kMSMasterKeyID;

    /**
     * @return &#34;KMSMasterKeyID&#34; can only be used when you set the value of SSEAlgorithm as aws:kms.
     * 
     */
    public Optional<Output<String>> kMSMasterKeyID() {
        return Optional.ofNullable(this.kMSMasterKeyID);
    }

    @Import(name="sSEAlgorithm", required=true)
    private Output<BucketServerSideEncryptionByDefaultSSEAlgorithm> sSEAlgorithm;

    public Output<BucketServerSideEncryptionByDefaultSSEAlgorithm> sSEAlgorithm() {
        return this.sSEAlgorithm;
    }

    private BucketServerSideEncryptionByDefaultArgs() {}

    private BucketServerSideEncryptionByDefaultArgs(BucketServerSideEncryptionByDefaultArgs $) {
        this.kMSMasterKeyID = $.kMSMasterKeyID;
        this.sSEAlgorithm = $.sSEAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketServerSideEncryptionByDefaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketServerSideEncryptionByDefaultArgs $;

        public Builder() {
            $ = new BucketServerSideEncryptionByDefaultArgs();
        }

        public Builder(BucketServerSideEncryptionByDefaultArgs defaults) {
            $ = new BucketServerSideEncryptionByDefaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kMSMasterKeyID &#34;KMSMasterKeyID&#34; can only be used when you set the value of SSEAlgorithm as aws:kms.
         * 
         * @return builder
         * 
         */
        public Builder kMSMasterKeyID(@Nullable Output<String> kMSMasterKeyID) {
            $.kMSMasterKeyID = kMSMasterKeyID;
            return this;
        }

        /**
         * @param kMSMasterKeyID &#34;KMSMasterKeyID&#34; can only be used when you set the value of SSEAlgorithm as aws:kms.
         * 
         * @return builder
         * 
         */
        public Builder kMSMasterKeyID(String kMSMasterKeyID) {
            return kMSMasterKeyID(Output.of(kMSMasterKeyID));
        }

        public Builder sSEAlgorithm(Output<BucketServerSideEncryptionByDefaultSSEAlgorithm> sSEAlgorithm) {
            $.sSEAlgorithm = sSEAlgorithm;
            return this;
        }

        public Builder sSEAlgorithm(BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm) {
            return sSEAlgorithm(Output.of(sSEAlgorithm));
        }

        public BucketServerSideEncryptionByDefaultArgs build() {
            $.sSEAlgorithm = Objects.requireNonNull($.sSEAlgorithm, "expected parameter 'sSEAlgorithm' to be non-null");
            return $;
        }
    }

}
