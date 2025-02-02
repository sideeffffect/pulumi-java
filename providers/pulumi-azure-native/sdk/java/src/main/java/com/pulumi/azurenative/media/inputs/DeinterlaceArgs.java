// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.DeinterlaceMode;
import com.pulumi.azurenative.media.enums.DeinterlaceParity;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the de-interlacing settings.
 * 
 */
public final class DeinterlaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeinterlaceArgs Empty = new DeinterlaceArgs();

    /**
     * The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,DeinterlaceMode>> mode;

    /**
     * @return The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     */
    public Optional<Output<Either<String,DeinterlaceMode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The field parity for de-interlacing, defaults to Auto.
     * 
     */
    @Import(name="parity")
    private @Nullable Output<Either<String,DeinterlaceParity>> parity;

    /**
     * @return The field parity for de-interlacing, defaults to Auto.
     * 
     */
    public Optional<Output<Either<String,DeinterlaceParity>>> parity() {
        return Optional.ofNullable(this.parity);
    }

    private DeinterlaceArgs() {}

    private DeinterlaceArgs(DeinterlaceArgs $) {
        this.mode = $.mode;
        this.parity = $.parity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeinterlaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeinterlaceArgs $;

        public Builder() {
            $ = new DeinterlaceArgs();
        }

        public Builder(DeinterlaceArgs defaults) {
            $ = new DeinterlaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode The deinterlacing mode. Defaults to AutoPixelAdaptive.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Either<String,DeinterlaceMode>> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The deinterlacing mode. Defaults to AutoPixelAdaptive.
         * 
         * @return builder
         * 
         */
        public Builder mode(Either<String,DeinterlaceMode> mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param mode The deinterlacing mode. Defaults to AutoPixelAdaptive.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        /**
         * @param mode The deinterlacing mode. Defaults to AutoPixelAdaptive.
         * 
         * @return builder
         * 
         */
        public Builder mode(DeinterlaceMode mode) {
            return mode(Either.ofRight(mode));
        }

        /**
         * @param parity The field parity for de-interlacing, defaults to Auto.
         * 
         * @return builder
         * 
         */
        public Builder parity(@Nullable Output<Either<String,DeinterlaceParity>> parity) {
            $.parity = parity;
            return this;
        }

        /**
         * @param parity The field parity for de-interlacing, defaults to Auto.
         * 
         * @return builder
         * 
         */
        public Builder parity(Either<String,DeinterlaceParity> parity) {
            return parity(Output.of(parity));
        }

        /**
         * @param parity The field parity for de-interlacing, defaults to Auto.
         * 
         * @return builder
         * 
         */
        public Builder parity(String parity) {
            return parity(Either.ofLeft(parity));
        }

        /**
         * @param parity The field parity for de-interlacing, defaults to Auto.
         * 
         * @return builder
         * 
         */
        public Builder parity(DeinterlaceParity parity) {
            return parity(Either.ofRight(parity));
        }

        public DeinterlaceArgs build() {
            return $;
        }
    }

}
