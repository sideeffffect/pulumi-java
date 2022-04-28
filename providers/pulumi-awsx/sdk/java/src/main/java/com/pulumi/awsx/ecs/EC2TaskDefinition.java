// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.ecs;

import com.pulumi.aws.cloudwatch.LogGroup;
import com.pulumi.aws.ecs.TaskDefinition;
import com.pulumi.aws.ecs.outputs.ServiceLoadBalancer;
import com.pulumi.aws.iam.Role;
import com.pulumi.awsx.Utilities;
import com.pulumi.awsx.ecs.EC2TaskDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Create a TaskDefinition resource with the given unique name, arguments, and options.
 * Creates required log-group and task &amp; execution roles.
 * Presents required Service load balancers if target group included in port mappings.
 * 
 */
@ResourceType(type="awsx:ecs:EC2TaskDefinition")
public class EC2TaskDefinition extends com.pulumi.resources.ComponentResource {
    /**
     * Auto-created IAM task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    @Export(name="executionRole", type=Role.class, parameters={})
    private Output</* @Nullable */ Role> executionRole;

    /**
     * @return Auto-created IAM task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    public Output<Optional<Role>> executionRole() {
        return Codegen.optional(this.executionRole);
    }
    /**
     * Computed load balancers from target groups specified of container port mappings.
     * 
     */
    @Export(name="loadBalancers", type=List.class, parameters={ServiceLoadBalancer.class})
    private Output<List<ServiceLoadBalancer>> loadBalancers;

    /**
     * @return Computed load balancers from target groups specified of container port mappings.
     * 
     */
    public Output<List<ServiceLoadBalancer>> loadBalancers() {
        return this.loadBalancers;
    }
    /**
     * Auto-created Log Group resource for use by containers.
     * 
     */
    @Export(name="logGroup", type=LogGroup.class, parameters={})
    private Output</* @Nullable */ LogGroup> logGroup;

    /**
     * @return Auto-created Log Group resource for use by containers.
     * 
     */
    public Output<Optional<LogGroup>> logGroup() {
        return Codegen.optional(this.logGroup);
    }
    /**
     * Underlying ECS Task Definition resource
     * 
     */
    @Export(name="taskDefinition", type=TaskDefinition.class, parameters={})
    private Output<TaskDefinition> taskDefinition;

    /**
     * @return Underlying ECS Task Definition resource
     * 
     */
    public Output<TaskDefinition> taskDefinition() {
        return this.taskDefinition;
    }
    /**
     * Auto-created IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    @Export(name="taskRole", type=Role.class, parameters={})
    private Output</* @Nullable */ Role> taskRole;

    /**
     * @return Auto-created IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    public Output<Optional<Role>> taskRole() {
        return Codegen.optional(this.taskRole);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EC2TaskDefinition(String name) {
        this(name, EC2TaskDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EC2TaskDefinition(String name, @Nullable EC2TaskDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EC2TaskDefinition(String name, @Nullable EC2TaskDefinitionArgs args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("awsx:ecs:EC2TaskDefinition", name, args == null ? EC2TaskDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
