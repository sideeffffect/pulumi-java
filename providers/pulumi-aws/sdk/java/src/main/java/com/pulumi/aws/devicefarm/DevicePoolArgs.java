// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm;

import com.pulumi.aws.devicefarm.inputs.DevicePoolRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DevicePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePoolArgs Empty = new DevicePoolArgs();

    /**
     * The device pool&#39;s description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The number of devices that Device Farm can add to your device pool.
     * 
     */
    @Import(name="maxDevices")
    private @Nullable Output<Integer> maxDevices;

    public Optional<Output<Integer>> maxDevices() {
        return Optional.ofNullable(this.maxDevices);
    }

    /**
     * The name of the Device Pool
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARN of the project for the device pool.
     * 
     */
    @Import(name="projectArn", required=true)
    private Output<String> projectArn;

    public Output<String> projectArn() {
        return this.projectArn;
    }

    /**
     * The device pool&#39;s rules. See Rule.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<DevicePoolRuleArgs>> rules;

    public Output<List<DevicePoolRuleArgs>> rules() {
        return this.rules;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private DevicePoolArgs() {}

    private DevicePoolArgs(DevicePoolArgs $) {
        this.description = $.description;
        this.maxDevices = $.maxDevices;
        this.name = $.name;
        this.projectArn = $.projectArn;
        this.rules = $.rules;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePoolArgs $;

        public Builder() {
            $ = new DevicePoolArgs();
        }

        public Builder(DevicePoolArgs defaults) {
            $ = new DevicePoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder maxDevices(@Nullable Output<Integer> maxDevices) {
            $.maxDevices = maxDevices;
            return this;
        }

        public Builder maxDevices(Integer maxDevices) {
            return maxDevices(Output.of(maxDevices));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder projectArn(Output<String> projectArn) {
            $.projectArn = projectArn;
            return this;
        }

        public Builder projectArn(String projectArn) {
            return projectArn(Output.of(projectArn));
        }

        public Builder rules(Output<List<DevicePoolRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<DevicePoolRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(DevicePoolRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public DevicePoolArgs build() {
            $.projectArn = Objects.requireNonNull($.projectArn, "expected parameter 'projectArn' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
