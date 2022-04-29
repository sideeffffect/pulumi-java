// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.AnalysisDataSetReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;The source template of an analysis.&lt;/p&gt;
 * 
 */
public final class AnalysisSourceTemplateArgs extends ResourceArgs {

    public static final AnalysisSourceTemplateArgs Empty = new AnalysisSourceTemplateArgs();

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the source template of an analysis.&lt;/p&gt;
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) of the source template of an analysis.&lt;/p&gt;
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * &lt;p&gt;The dataset references of the source template of an analysis.&lt;/p&gt;
     * 
     */
    @Import(name="dataSetReferences", required=true)
    private Output<List<AnalysisDataSetReferenceArgs>> dataSetReferences;

    /**
     * @return &lt;p&gt;The dataset references of the source template of an analysis.&lt;/p&gt;
     * 
     */
    public Output<List<AnalysisDataSetReferenceArgs>> dataSetReferences() {
        return this.dataSetReferences;
    }

    private AnalysisSourceTemplateArgs() {}

    private AnalysisSourceTemplateArgs(AnalysisSourceTemplateArgs $) {
        this.arn = $.arn;
        this.dataSetReferences = $.dataSetReferences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalysisSourceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalysisSourceTemplateArgs $;

        public Builder() {
            $ = new AnalysisSourceTemplateArgs();
        }

        public Builder(AnalysisSourceTemplateArgs defaults) {
            $ = new AnalysisSourceTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn &lt;p&gt;The Amazon Resource Name (ARN) of the source template of an analysis.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn &lt;p&gt;The Amazon Resource Name (ARN) of the source template of an analysis.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param dataSetReferences &lt;p&gt;The dataset references of the source template of an analysis.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder dataSetReferences(Output<List<AnalysisDataSetReferenceArgs>> dataSetReferences) {
            $.dataSetReferences = dataSetReferences;
            return this;
        }

        /**
         * @param dataSetReferences &lt;p&gt;The dataset references of the source template of an analysis.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder dataSetReferences(List<AnalysisDataSetReferenceArgs> dataSetReferences) {
            return dataSetReferences(Output.of(dataSetReferences));
        }

        /**
         * @param dataSetReferences &lt;p&gt;The dataset references of the source template of an analysis.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder dataSetReferences(AnalysisDataSetReferenceArgs... dataSetReferences) {
            return dataSetReferences(List.of(dataSetReferences));
        }

        public AnalysisSourceTemplateArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.dataSetReferences = Objects.requireNonNull($.dataSetReferences, "expected parameter 'dataSetReferences' to be non-null");
            return $;
        }
    }

}
