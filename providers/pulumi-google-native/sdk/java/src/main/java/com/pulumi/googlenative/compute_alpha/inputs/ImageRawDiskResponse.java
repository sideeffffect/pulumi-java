// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters of the raw disk image.
 * 
 */
public final class ImageRawDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageRawDiskResponse Empty = new ImageRawDiskResponse();

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
     * 
     */
    @Import(name="containerType", required=true)
    private String containerType;

    public String containerType() {
        return this.containerType;
    }

    /**
     * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @Import(name="source", required=true)
    private String source;

    public String source() {
        return this.source;
    }

    private ImageRawDiskResponse() {}

    private ImageRawDiskResponse(ImageRawDiskResponse $) {
        this.containerType = $.containerType;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRawDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRawDiskResponse $;

        public Builder() {
            $ = new ImageRawDiskResponse();
        }

        public Builder(ImageRawDiskResponse defaults) {
            $ = new ImageRawDiskResponse(Objects.requireNonNull(defaults));
        }

        public Builder containerType(String containerType) {
            $.containerType = containerType;
            return this;
        }

        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public ImageRawDiskResponse build() {
            $.containerType = Objects.requireNonNull($.containerType, "expected parameter 'containerType' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
