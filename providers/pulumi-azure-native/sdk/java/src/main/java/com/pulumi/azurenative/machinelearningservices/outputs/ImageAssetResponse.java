// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageAssetResponse {
    /**
     * The Asset Id.
     * 
     */
    private final @Nullable String id;
    /**
     * The mime type.
     * 
     */
    private final @Nullable String mimeType;
    /**
     * Whether the Asset is unpacked.
     * 
     */
    private final @Nullable Boolean unpack;
    /**
     * The Url of the Asset.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private ImageAssetResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("mimeType") @Nullable String mimeType,
        @CustomType.Parameter("unpack") @Nullable Boolean unpack,
        @CustomType.Parameter("url") @Nullable String url) {
        this.id = id;
        this.mimeType = mimeType;
        this.unpack = unpack;
        this.url = url;
    }

    /**
     * The Asset Id.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The mime type.
     * 
    */
    public Optional<String> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }
    /**
     * Whether the Asset is unpacked.
     * 
    */
    public Optional<Boolean> unpack() {
        return Optional.ofNullable(this.unpack);
    }
    /**
     * The Url of the Asset.
     * 
    */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageAssetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String mimeType;
        private @Nullable Boolean unpack;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageAssetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mimeType = defaults.mimeType;
    	      this.unpack = defaults.unpack;
    	      this.url = defaults.url;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public Builder unpack(@Nullable Boolean unpack) {
            this.unpack = unpack;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public ImageAssetResponse build() {
            return new ImageAssetResponse(id, mimeType, unpack, url);
        }
    }
}
