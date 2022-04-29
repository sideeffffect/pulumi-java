// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetTaskDefinitionArgs extends InvokeArgs {

    public static final GetTaskDefinitionArgs Empty = new GetTaskDefinitionArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS task definition
     * 
     */
    @Import(name="taskDefinitionArn", required=true)
    private String taskDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon ECS task definition
     * 
     */
    public String taskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    private GetTaskDefinitionArgs() {}

    private GetTaskDefinitionArgs(GetTaskDefinitionArgs $) {
        this.taskDefinitionArn = $.taskDefinitionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskDefinitionArgs $;

        public Builder() {
            $ = new GetTaskDefinitionArgs();
        }

        public Builder(GetTaskDefinitionArgs defaults) {
            $ = new GetTaskDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param taskDefinitionArn The Amazon Resource Name (ARN) of the Amazon ECS task definition
         * 
         * @return builder
         * 
         */
        public Builder taskDefinitionArn(String taskDefinitionArn) {
            $.taskDefinitionArn = taskDefinitionArn;
            return this;
        }

        public GetTaskDefinitionArgs build() {
            $.taskDefinitionArn = Objects.requireNonNull($.taskDefinitionArn, "expected parameter 'taskDefinitionArn' to be non-null");
            return $;
        }
    }

}
