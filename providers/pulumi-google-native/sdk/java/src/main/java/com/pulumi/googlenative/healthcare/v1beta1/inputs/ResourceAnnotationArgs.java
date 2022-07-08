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
 * Resource level annotation.
 * 
 */
public final class ResourceAnnotationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceAnnotationArgs Empty = new ResourceAnnotationArgs();

    /**
     * A description of the annotation record.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A description of the annotation record.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    private ResourceAnnotationArgs() {}

    private ResourceAnnotationArgs(ResourceAnnotationArgs $) {
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceAnnotationArgs $;

        public Builder() {
            $ = new ResourceAnnotationArgs();
        }

        public Builder(ResourceAnnotationArgs defaults) {
            $ = new ResourceAnnotationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label A description of the annotation record.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A description of the annotation record.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public ResourceAnnotationArgs build() {
            return $;
        }
    }

}
