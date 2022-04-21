// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata for the text.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1TextMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1TextMetadataArgs Empty = new GoogleCloudDatalabelingV1beta1TextMetadataArgs();

    /**
     * The language of this text, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    private GoogleCloudDatalabelingV1beta1TextMetadataArgs() {}

    private GoogleCloudDatalabelingV1beta1TextMetadataArgs(GoogleCloudDatalabelingV1beta1TextMetadataArgs $) {
        this.languageCode = $.languageCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatalabelingV1beta1TextMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1TextMetadataArgs $;

        public Builder() {
            $ = new GoogleCloudDatalabelingV1beta1TextMetadataArgs();
        }

        public Builder(GoogleCloudDatalabelingV1beta1TextMetadataArgs defaults) {
            $ = new GoogleCloudDatalabelingV1beta1TextMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public GoogleCloudDatalabelingV1beta1TextMetadataArgs build() {
            return $;
        }
    }

}
