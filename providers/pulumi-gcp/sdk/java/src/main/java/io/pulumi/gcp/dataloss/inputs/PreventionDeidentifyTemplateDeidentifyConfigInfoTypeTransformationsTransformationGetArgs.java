// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs();

    /**
     * InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
     * all findings that correspond to infoTypes that were requested in InspectConfig.
     * Structure is documented below.
     * 
     */
    @Import(name="infoTypes")
      private final @Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs>> infoTypes;

    public Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs>> infoTypes() {
        return this.infoTypes == null ? Codegen.empty() : this.infoTypes;
    }

    /**
     * Primitive transformation to apply to the infoType.
     * Structure is documented below.
     * 
     */
    @Import(name="primitiveTransformation", required=true)
      private final Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs> primitiveTransformation;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs> primitiveTransformation() {
        return this.primitiveTransformation;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs(
        @Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs>> infoTypes,
        Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs> primitiveTransformation) {
        this.infoTypes = infoTypes;
        this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation, "expected parameter 'primitiveTransformation' to be non-null");
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs() {
        this.infoTypes = Codegen.empty();
        this.primitiveTransformation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs>> infoTypes;
        private Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs> primitiveTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        public Builder infoTypes(@Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs>> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }
        public Builder infoTypes(@Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs> infoTypes) {
            this.infoTypes = Codegen.ofNullable(infoTypes);
            return this;
        }
        public Builder infoTypes(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder primitiveTransformation(Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs> primitiveTransformation) {
            this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
            return this;
        }
        public Builder primitiveTransformation(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs primitiveTransformation) {
            this.primitiveTransformation = Output.of(Objects.requireNonNull(primitiveTransformation));
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationGetArgs(infoTypes, primitiveTransformation);
        }
    }
}
