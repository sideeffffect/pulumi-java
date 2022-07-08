// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Raw bytes representing consent artifact content.
 * 
 */
public final class ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    /**
     * Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
     * 
     */
    @Import(name="gcsUri")
    private @Nullable Output<String> gcsUri;

    /**
     * @return Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
     * 
     */
    public Optional<Output<String>> gcsUri() {
        return Optional.ofNullable(this.gcsUri);
    }

    /**
     * Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and ListConsentArtifact response.
     * 
     */
    @Import(name="rawBytes")
    private @Nullable Output<String> rawBytes;

    /**
     * @return Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and ListConsentArtifact response.
     * 
     */
    public Optional<Output<String>> rawBytes() {
        return Optional.ofNullable(this.rawBytes);
    }

    private ImageArgs() {}

    private ImageArgs(ImageArgs $) {
        this.gcsUri = $.gcsUri;
        this.rawBytes = $.rawBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageArgs $;

        public Builder() {
            $ = new ImageArgs();
        }

        public Builder(ImageArgs defaults) {
            $ = new ImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcsUri Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
         * 
         * @return builder
         * 
         */
        public Builder gcsUri(@Nullable Output<String> gcsUri) {
            $.gcsUri = gcsUri;
            return this;
        }

        /**
         * @param gcsUri Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
         * 
         * @return builder
         * 
         */
        public Builder gcsUri(String gcsUri) {
            return gcsUri(Output.of(gcsUri));
        }

        /**
         * @param rawBytes Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and ListConsentArtifact response.
         * 
         * @return builder
         * 
         */
        public Builder rawBytes(@Nullable Output<String> rawBytes) {
            $.rawBytes = rawBytes;
            return this;
        }

        /**
         * @param rawBytes Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and ListConsentArtifact response.
         * 
         * @return builder
         * 
         */
        public Builder rawBytes(String rawBytes) {
            return rawBytes(Output.of(rawBytes));
        }

        public ImageArgs build() {
            return $;
        }
    }

}
