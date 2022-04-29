// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigLimitsArgs extends ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigLimitsArgs Empty = new PreventionInspectTemplateInspectConfigLimitsArgs();

    /**
     * Configuration of findings limit given for specified infoTypes.
     * Structure is documented below.
     * 
     */
    @Import(name="maxFindingsPerInfoTypes")
    private @Nullable Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>> maxFindingsPerInfoTypes;

    /**
     * @return Configuration of findings limit given for specified infoTypes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>>> maxFindingsPerInfoTypes() {
        return Optional.ofNullable(this.maxFindingsPerInfoTypes);
    }

    /**
     * Max number of findings that will be returned for each item scanned. The maximum returned is 2000.
     * 
     */
    @Import(name="maxFindingsPerItem", required=true)
    private Output<Integer> maxFindingsPerItem;

    /**
     * @return Max number of findings that will be returned for each item scanned. The maximum returned is 2000.
     * 
     */
    public Output<Integer> maxFindingsPerItem() {
        return this.maxFindingsPerItem;
    }

    /**
     * Max number of findings that will be returned per request/job. The maximum returned is 2000.
     * 
     */
    @Import(name="maxFindingsPerRequest", required=true)
    private Output<Integer> maxFindingsPerRequest;

    /**
     * @return Max number of findings that will be returned per request/job. The maximum returned is 2000.
     * 
     */
    public Output<Integer> maxFindingsPerRequest() {
        return this.maxFindingsPerRequest;
    }

    private PreventionInspectTemplateInspectConfigLimitsArgs() {}

    private PreventionInspectTemplateInspectConfigLimitsArgs(PreventionInspectTemplateInspectConfigLimitsArgs $) {
        this.maxFindingsPerInfoTypes = $.maxFindingsPerInfoTypes;
        this.maxFindingsPerItem = $.maxFindingsPerItem;
        this.maxFindingsPerRequest = $.maxFindingsPerRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigLimitsArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigLimitsArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigLimitsArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxFindingsPerInfoTypes Configuration of findings limit given for specified infoTypes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxFindingsPerInfoTypes(@Nullable Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>> maxFindingsPerInfoTypes) {
            $.maxFindingsPerInfoTypes = maxFindingsPerInfoTypes;
            return this;
        }

        /**
         * @param maxFindingsPerInfoTypes Configuration of findings limit given for specified infoTypes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxFindingsPerInfoTypes(List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs> maxFindingsPerInfoTypes) {
            return maxFindingsPerInfoTypes(Output.of(maxFindingsPerInfoTypes));
        }

        /**
         * @param maxFindingsPerInfoTypes Configuration of findings limit given for specified infoTypes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxFindingsPerInfoTypes(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs... maxFindingsPerInfoTypes) {
            return maxFindingsPerInfoTypes(List.of(maxFindingsPerInfoTypes));
        }

        /**
         * @param maxFindingsPerItem Max number of findings that will be returned for each item scanned. The maximum returned is 2000.
         * 
         * @return builder
         * 
         */
        public Builder maxFindingsPerItem(Output<Integer> maxFindingsPerItem) {
            $.maxFindingsPerItem = maxFindingsPerItem;
            return this;
        }

        /**
         * @param maxFindingsPerItem Max number of findings that will be returned for each item scanned. The maximum returned is 2000.
         * 
         * @return builder
         * 
         */
        public Builder maxFindingsPerItem(Integer maxFindingsPerItem) {
            return maxFindingsPerItem(Output.of(maxFindingsPerItem));
        }

        /**
         * @param maxFindingsPerRequest Max number of findings that will be returned per request/job. The maximum returned is 2000.
         * 
         * @return builder
         * 
         */
        public Builder maxFindingsPerRequest(Output<Integer> maxFindingsPerRequest) {
            $.maxFindingsPerRequest = maxFindingsPerRequest;
            return this;
        }

        /**
         * @param maxFindingsPerRequest Max number of findings that will be returned per request/job. The maximum returned is 2000.
         * 
         * @return builder
         * 
         */
        public Builder maxFindingsPerRequest(Integer maxFindingsPerRequest) {
            return maxFindingsPerRequest(Output.of(maxFindingsPerRequest));
        }

        public PreventionInspectTemplateInspectConfigLimitsArgs build() {
            $.maxFindingsPerItem = Objects.requireNonNull($.maxFindingsPerItem, "expected parameter 'maxFindingsPerItem' to be non-null");
            $.maxFindingsPerRequest = Objects.requireNonNull($.maxFindingsPerRequest, "expected parameter 'maxFindingsPerRequest' to be non-null");
            return $;
        }
    }

}
