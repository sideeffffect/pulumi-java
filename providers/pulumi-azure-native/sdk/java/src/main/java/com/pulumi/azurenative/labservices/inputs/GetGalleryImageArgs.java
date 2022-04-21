// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGalleryImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGalleryImageArgs Empty = new GetGalleryImageArgs();

    /**
     * Specify the $expand query. Example: &#39;properties($select=author)&#39;
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the gallery Image.
     * 
     */
    @Import(name="galleryImageName", required=true)
    private String galleryImageName;

    public String galleryImageName() {
        return this.galleryImageName;
    }

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
    private String labAccountName;

    public String labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetGalleryImageArgs() {}

    private GetGalleryImageArgs(GetGalleryImageArgs $) {
        this.expand = $.expand;
        this.galleryImageName = $.galleryImageName;
        this.labAccountName = $.labAccountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGalleryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGalleryImageArgs $;

        public Builder() {
            $ = new GetGalleryImageArgs();
        }

        public Builder(GetGalleryImageArgs defaults) {
            $ = new GetGalleryImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder galleryImageName(String galleryImageName) {
            $.galleryImageName = galleryImageName;
            return this;
        }

        public Builder labAccountName(String labAccountName) {
            $.labAccountName = labAccountName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetGalleryImageArgs build() {
            $.galleryImageName = Objects.requireNonNull($.galleryImageName, "expected parameter 'galleryImageName' to be non-null");
            $.labAccountName = Objects.requireNonNull($.labAccountName, "expected parameter 'labAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
