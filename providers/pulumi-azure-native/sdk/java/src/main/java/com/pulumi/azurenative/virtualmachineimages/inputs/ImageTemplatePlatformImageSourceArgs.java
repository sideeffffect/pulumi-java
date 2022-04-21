// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.azurenative.virtualmachineimages.inputs.PlatformImagePurchasePlanArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an image source from [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
 * 
 */
public final class ImageTemplatePlatformImageSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageTemplatePlatformImageSourceArgs Empty = new ImageTemplatePlatformImageSourceArgs();

    /**
     * Image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="offer")
    private @Nullable Output<String> offer;

    public Optional<Output<String>> offer() {
        return Optional.ofNullable(this.offer);
    }

    /**
     * Optional configuration of purchase plan for platform image.
     * 
     */
    @Import(name="planInfo")
    private @Nullable Output<PlatformImagePurchasePlanArgs> planInfo;

    public Optional<Output<PlatformImagePurchasePlanArgs>> planInfo() {
        return Optional.ofNullable(this.planInfo);
    }

    /**
     * Image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * Image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Specifies the type of source image you want to start with.
     * Expected value is &#39;PlatformImage&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If &#39;latest&#39; is specified here, the version is evaluated when the image build takes place, not when the template is submitted. Specifying &#39;latest&#39; could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ImageTemplatePlatformImageSourceArgs() {}

    private ImageTemplatePlatformImageSourceArgs(ImageTemplatePlatformImageSourceArgs $) {
        this.offer = $.offer;
        this.planInfo = $.planInfo;
        this.publisher = $.publisher;
        this.sku = $.sku;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplatePlatformImageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplatePlatformImageSourceArgs $;

        public Builder() {
            $ = new ImageTemplatePlatformImageSourceArgs();
        }

        public Builder(ImageTemplatePlatformImageSourceArgs defaults) {
            $ = new ImageTemplatePlatformImageSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder offer(@Nullable Output<String> offer) {
            $.offer = offer;
            return this;
        }

        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        public Builder planInfo(@Nullable Output<PlatformImagePurchasePlanArgs> planInfo) {
            $.planInfo = planInfo;
            return this;
        }

        public Builder planInfo(PlatformImagePurchasePlanArgs planInfo) {
            return planInfo(Output.of(planInfo));
        }

        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ImageTemplatePlatformImageSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
