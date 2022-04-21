// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.enums.MonitoredResourceDescriptorLaunchStage;
import com.pulumi.googlenative.servicemanagement_v1.inputs.LabelDescriptorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that describes the schema of a MonitoredResource object using a type name and a set of labels. For example, the monitored resource descriptor for Google Compute Engine VM instances has a type of `&#34;gce_instance&#34;` and specifies the use of the labels `&#34;instance_id&#34;` and `&#34;zone&#34;` to identify particular VM instances. Different APIs can support different monitored resource types. APIs generally provide a `list` method that returns the monitored resource descriptors used by the API.
 * 
 */
public final class MonitoredResourceDescriptorArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredResourceDescriptorArgs Empty = new MonitoredResourceDescriptorArgs();

    /**
     * Optional. A detailed description of the monitored resource type that might be used in documentation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. A concise name for the monitored resource type that might be displayed in user interfaces. It should be a Title Cased Noun Phrase, without any article or other determiners. For example, `&#34;Google Cloud SQL Database&#34;`.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * A set of labels used to describe instances of this monitored resource type. For example, an individual Google Cloud SQL database is identified by values for the labels `&#34;database_id&#34;` and `&#34;zone&#34;`.
     * 
     */
    @Import(name="labels", required=true)
    private Output<List<LabelDescriptorArgs>> labels;

    public Output<List<LabelDescriptorArgs>> labels() {
        return this.labels;
    }

    /**
     * Optional. The launch stage of the monitored resource definition.
     * 
     */
    @Import(name="launchStage")
    private @Nullable Output<MonitoredResourceDescriptorLaunchStage> launchStage;

    public Optional<Output<MonitoredResourceDescriptorLaunchStage>> launchStage() {
        return Optional.ofNullable(this.launchStage);
    }

    /**
     * Optional. The resource name of the monitored resource descriptor: `&#34;projects/{project_id}/monitoredResourceDescriptors/{type}&#34;` where {type} is the value of the `type` field in this object and {project_id} is a project ID that provides API-specific context for accessing the type. APIs that do not use project information can use the resource name format `&#34;monitoredResourceDescriptors/{type}&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The monitored resource type. For example, the type `&#34;cloudsql_database&#34;` represents databases in Google Cloud SQL. For a list of types, see [Monitoring resource types](https://cloud.google.com/monitoring/api/resources) and [Logging resource types](https://cloud.google.com/logging/docs/api/v2/resource-list).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private MonitoredResourceDescriptorArgs() {}

    private MonitoredResourceDescriptorArgs(MonitoredResourceDescriptorArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.launchStage = $.launchStage;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredResourceDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredResourceDescriptorArgs $;

        public Builder() {
            $ = new MonitoredResourceDescriptorArgs();
        }

        public Builder(MonitoredResourceDescriptorArgs defaults) {
            $ = new MonitoredResourceDescriptorArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder labels(Output<List<LabelDescriptorArgs>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(List<LabelDescriptorArgs> labels) {
            return labels(Output.of(labels));
        }

        public Builder labels(LabelDescriptorArgs... labels) {
            return labels(List.of(labels));
        }

        public Builder launchStage(@Nullable Output<MonitoredResourceDescriptorLaunchStage> launchStage) {
            $.launchStage = launchStage;
            return this;
        }

        public Builder launchStage(MonitoredResourceDescriptorLaunchStage launchStage) {
            return launchStage(Output.of(launchStage));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MonitoredResourceDescriptorArgs build() {
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
