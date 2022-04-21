// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessReviewScheduleDefinitionByIdArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessReviewScheduleDefinitionByIdArgs Empty = new GetAccessReviewScheduleDefinitionByIdArgs();

    /**
     * The id of the access review schedule definition.
     * 
     */
    @Import(name="scheduleDefinitionId", required=true)
    private String scheduleDefinitionId;

    public String scheduleDefinitionId() {
        return this.scheduleDefinitionId;
    }

    private GetAccessReviewScheduleDefinitionByIdArgs() {}

    private GetAccessReviewScheduleDefinitionByIdArgs(GetAccessReviewScheduleDefinitionByIdArgs $) {
        this.scheduleDefinitionId = $.scheduleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessReviewScheduleDefinitionByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessReviewScheduleDefinitionByIdArgs $;

        public Builder() {
            $ = new GetAccessReviewScheduleDefinitionByIdArgs();
        }

        public Builder(GetAccessReviewScheduleDefinitionByIdArgs defaults) {
            $ = new GetAccessReviewScheduleDefinitionByIdArgs(Objects.requireNonNull(defaults));
        }

        public Builder scheduleDefinitionId(String scheduleDefinitionId) {
            $.scheduleDefinitionId = scheduleDefinitionId;
            return this;
        }

        public GetAccessReviewScheduleDefinitionByIdArgs build() {
            $.scheduleDefinitionId = Objects.requireNonNull($.scheduleDefinitionId, "expected parameter 'scheduleDefinitionId' to be non-null");
            return $;
        }
    }

}
