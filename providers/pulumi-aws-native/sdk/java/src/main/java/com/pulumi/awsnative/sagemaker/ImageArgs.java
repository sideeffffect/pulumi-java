// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.inputs.ImageTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    @Import(name="imageDescription")
    private @Nullable Output<String> imageDescription;

    public Optional<Output<String>> imageDescription() {
        return Optional.ofNullable(this.imageDescription);
    }

    @Import(name="imageDisplayName")
    private @Nullable Output<String> imageDisplayName;

    public Optional<Output<String>> imageDisplayName() {
        return Optional.ofNullable(this.imageDisplayName);
    }

    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    @Import(name="imageRoleArn", required=true)
    private Output<String> imageRoleArn;

    public Output<String> imageRoleArn() {
        return this.imageRoleArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ImageTagArgs>> tags;

    public Optional<Output<List<ImageTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ImageArgs() {}

    private ImageArgs(ImageArgs $) {
        this.imageDescription = $.imageDescription;
        this.imageDisplayName = $.imageDisplayName;
        this.imageName = $.imageName;
        this.imageRoleArn = $.imageRoleArn;
        this.tags = $.tags;
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

        public Builder imageDescription(@Nullable Output<String> imageDescription) {
            $.imageDescription = imageDescription;
            return this;
        }

        public Builder imageDescription(String imageDescription) {
            return imageDescription(Output.of(imageDescription));
        }

        public Builder imageDisplayName(@Nullable Output<String> imageDisplayName) {
            $.imageDisplayName = imageDisplayName;
            return this;
        }

        public Builder imageDisplayName(String imageDisplayName) {
            return imageDisplayName(Output.of(imageDisplayName));
        }

        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        public Builder imageRoleArn(Output<String> imageRoleArn) {
            $.imageRoleArn = imageRoleArn;
            return this;
        }

        public Builder imageRoleArn(String imageRoleArn) {
            return imageRoleArn(Output.of(imageRoleArn));
        }

        public Builder tags(@Nullable Output<List<ImageTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ImageTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ImageTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ImageArgs build() {
            $.imageRoleArn = Objects.requireNonNull($.imageRoleArn, "expected parameter 'imageRoleArn' to be non-null");
            return $;
        }
    }

}
