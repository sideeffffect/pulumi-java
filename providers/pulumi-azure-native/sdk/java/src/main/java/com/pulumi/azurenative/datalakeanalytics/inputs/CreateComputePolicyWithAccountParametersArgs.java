// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.inputs;

import com.pulumi.azurenative.datalakeanalytics.enums.AADObjectType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters used to create a new compute policy while creating a new Data Lake Analytics account.
 * 
 */
public final class CreateComputePolicyWithAccountParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final CreateComputePolicyWithAccountParametersArgs Empty = new CreateComputePolicyWithAccountParametersArgs();

    /**
     * The maximum degree of parallelism per job this user can use to submit jobs. This property, the min priority per job property, or both must be passed.
     * 
     */
    @Import(name="maxDegreeOfParallelismPerJob")
    private @Nullable Output<Integer> maxDegreeOfParallelismPerJob;

    public Optional<Output<Integer>> maxDegreeOfParallelismPerJob() {
        return Optional.ofNullable(this.maxDegreeOfParallelismPerJob);
    }

    /**
     * The minimum priority per job this user can use to submit jobs. This property, the max degree of parallelism per job property, or both must be passed.
     * 
     */
    @Import(name="minPriorityPerJob")
    private @Nullable Output<Integer> minPriorityPerJob;

    public Optional<Output<Integer>> minPriorityPerJob() {
        return Optional.ofNullable(this.minPriorityPerJob);
    }

    /**
     * The unique name of the compute policy to create.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The AAD object identifier for the entity to create a policy for.
     * 
     */
    @Import(name="objectId", required=true)
    private Output<String> objectId;

    public Output<String> objectId() {
        return this.objectId;
    }

    /**
     * The type of AAD object the object identifier refers to.
     * 
     */
    @Import(name="objectType", required=true)
    private Output<Either<String,AADObjectType>> objectType;

    public Output<Either<String,AADObjectType>> objectType() {
        return this.objectType;
    }

    private CreateComputePolicyWithAccountParametersArgs() {}

    private CreateComputePolicyWithAccountParametersArgs(CreateComputePolicyWithAccountParametersArgs $) {
        this.maxDegreeOfParallelismPerJob = $.maxDegreeOfParallelismPerJob;
        this.minPriorityPerJob = $.minPriorityPerJob;
        this.name = $.name;
        this.objectId = $.objectId;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateComputePolicyWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateComputePolicyWithAccountParametersArgs $;

        public Builder() {
            $ = new CreateComputePolicyWithAccountParametersArgs();
        }

        public Builder(CreateComputePolicyWithAccountParametersArgs defaults) {
            $ = new CreateComputePolicyWithAccountParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxDegreeOfParallelismPerJob(@Nullable Output<Integer> maxDegreeOfParallelismPerJob) {
            $.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
            return this;
        }

        public Builder maxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
            return maxDegreeOfParallelismPerJob(Output.of(maxDegreeOfParallelismPerJob));
        }

        public Builder minPriorityPerJob(@Nullable Output<Integer> minPriorityPerJob) {
            $.minPriorityPerJob = minPriorityPerJob;
            return this;
        }

        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            return minPriorityPerJob(Output.of(minPriorityPerJob));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder objectId(Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        public Builder objectType(Output<Either<String,AADObjectType>> objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder objectType(Either<String,AADObjectType> objectType) {
            return objectType(Output.of(objectType));
        }

        public CreateComputePolicyWithAccountParametersArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            return $;
        }
    }

}
