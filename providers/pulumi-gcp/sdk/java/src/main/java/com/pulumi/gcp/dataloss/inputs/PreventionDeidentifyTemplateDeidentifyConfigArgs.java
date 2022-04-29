// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigArgs extends ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigArgs();

    /**
     * Specifies free-text based transformations to be applied to the dataset.
     * Structure is documented below.
     * 
     */
    @Import(name="infoTypeTransformations", required=true)
    private Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> infoTypeTransformations;

    /**
     * @return Specifies free-text based transformations to be applied to the dataset.
     * Structure is documented below.
     * 
     */
    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> infoTypeTransformations() {
        return this.infoTypeTransformations;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigArgs(PreventionDeidentifyTemplateDeidentifyConfigArgs $) {
        this.infoTypeTransformations = $.infoTypeTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param infoTypeTransformations Specifies free-text based transformations to be applied to the dataset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoTypeTransformations(Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> infoTypeTransformations) {
            $.infoTypeTransformations = infoTypeTransformations;
            return this;
        }

        /**
         * @param infoTypeTransformations Specifies free-text based transformations to be applied to the dataset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoTypeTransformations(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs infoTypeTransformations) {
            return infoTypeTransformations(Output.of(infoTypeTransformations));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigArgs build() {
            $.infoTypeTransformations = Objects.requireNonNull($.infoTypeTransformations, "expected parameter 'infoTypeTransformations' to be non-null");
            return $;
        }
    }

}
