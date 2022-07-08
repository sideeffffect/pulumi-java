// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A vertex represents a 2D point in the image. NOTE: the vertex coordinates are in the same scale as the original image.
 * 
 */
public final class VertexArgs extends com.pulumi.resources.ResourceArgs {

    public static final VertexArgs Empty = new VertexArgs();

    /**
     * X coordinate.
     * 
     */
    @Import(name="x")
    private @Nullable Output<Integer> x;

    /**
     * @return X coordinate.
     * 
     */
    public Optional<Output<Integer>> x() {
        return Optional.ofNullable(this.x);
    }

    /**
     * Y coordinate.
     * 
     */
    @Import(name="y")
    private @Nullable Output<Integer> y;

    /**
     * @return Y coordinate.
     * 
     */
    public Optional<Output<Integer>> y() {
        return Optional.ofNullable(this.y);
    }

    private VertexArgs() {}

    private VertexArgs(VertexArgs $) {
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VertexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VertexArgs $;

        public Builder() {
            $ = new VertexArgs();
        }

        public Builder(VertexArgs defaults) {
            $ = new VertexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param x X coordinate.
         * 
         * @return builder
         * 
         */
        public Builder x(@Nullable Output<Integer> x) {
            $.x = x;
            return this;
        }

        /**
         * @param x X coordinate.
         * 
         * @return builder
         * 
         */
        public Builder x(Integer x) {
            return x(Output.of(x));
        }

        /**
         * @param y Y coordinate.
         * 
         * @return builder
         * 
         */
        public Builder y(@Nullable Output<Integer> y) {
            $.y = y;
            return this;
        }

        /**
         * @param y Y coordinate.
         * 
         * @return builder
         * 
         */
        public Builder y(Integer y) {
            return y(Output.of(y));
        }

        public VertexArgs build() {
            return $;
        }
    }

}
