// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetReportPlanArgs extends InvokeArgs {

    public static final GetReportPlanArgs Empty = new GetReportPlanArgs();

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    @Import(name="reportPlanArn", required=true)
    private String reportPlanArn;

    /**
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    public String reportPlanArn() {
        return this.reportPlanArn;
    }

    private GetReportPlanArgs() {}

    private GetReportPlanArgs(GetReportPlanArgs $) {
        this.reportPlanArn = $.reportPlanArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportPlanArgs $;

        public Builder() {
            $ = new GetReportPlanArgs();
        }

        public Builder(GetReportPlanArgs defaults) {
            $ = new GetReportPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reportPlanArn An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
         * 
         * @return builder
         * 
         */
        public Builder reportPlanArn(String reportPlanArn) {
            $.reportPlanArn = reportPlanArn;
            return this;
        }

        public GetReportPlanArgs build() {
            $.reportPlanArn = Objects.requireNonNull($.reportPlanArn, "expected parameter 'reportPlanArn' to be non-null");
            return $;
        }
    }

}
