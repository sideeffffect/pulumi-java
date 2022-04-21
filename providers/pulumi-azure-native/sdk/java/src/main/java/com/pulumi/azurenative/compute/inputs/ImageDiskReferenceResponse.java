// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The source image used for creating the disk.
 * 
 */
public final class ImageDiskReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageDiskReferenceResponse Empty = new ImageDiskReferenceResponse();

    /**
     * A relative uri containing either a Platform Image Repository or user image reference.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * If the disk is created from an image&#39;s data disk, this is an index that indicates which of the data disks in the image to use. For OS disks, this field is null.
     * 
     */
    @Import(name="lun")
    private @Nullable Integer lun;

    public Optional<Integer> lun() {
        return Optional.ofNullable(this.lun);
    }

    private ImageDiskReferenceResponse() {}

    private ImageDiskReferenceResponse(ImageDiskReferenceResponse $) {
        this.id = $.id;
        this.lun = $.lun;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageDiskReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageDiskReferenceResponse $;

        public Builder() {
            $ = new ImageDiskReferenceResponse();
        }

        public Builder(ImageDiskReferenceResponse defaults) {
            $ = new ImageDiskReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder lun(@Nullable Integer lun) {
            $.lun = lun;
            return this;
        }

        public ImageDiskReferenceResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
