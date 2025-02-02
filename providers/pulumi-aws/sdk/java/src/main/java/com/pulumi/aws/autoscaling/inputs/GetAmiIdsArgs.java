// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.aws.autoscaling.inputs.GetAmiIdsFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAmiIdsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAmiIdsArgs Empty = new GetAmiIdsArgs();

    /**
     * A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetAmiIdsFilterArgs>> filters;

    /**
     * @return A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     * 
     */
    public Optional<Output<List<GetAmiIdsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetAmiIdsArgs() {}

    private GetAmiIdsArgs(GetAmiIdsArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAmiIdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAmiIdsArgs $;

        public Builder() {
            $ = new GetAmiIdsArgs();
        }

        public Builder(GetAmiIdsArgs defaults) {
            $ = new GetAmiIdsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetAmiIdsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetAmiIdsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
         * 
         * @return builder
         * 
         */
        public Builder filters(GetAmiIdsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetAmiIdsArgs build() {
            return $;
        }
    }

}
