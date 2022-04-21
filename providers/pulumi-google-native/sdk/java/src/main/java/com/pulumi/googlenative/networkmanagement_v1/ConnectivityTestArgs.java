// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkmanagement_v1.inputs.EndpointArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectivityTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectivityTestArgs Empty = new ConnectivityTestArgs();

    /**
     * The user-supplied description of the Connectivity Test. Maximum of 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Destination specification of the Connectivity Test. You can use a combination of destination IP address, Compute Engine VM instance, or VPC network to uniquely identify the destination location. Even if the destination IP address is not unique, the source IP location is unique. Usually, the analysis can infer the destination endpoint from route information. If the destination you specify is a VM instance and the instance has multiple network interfaces, then you must also specify either a destination IP address or VPC network to identify the destination interface. A reachability analysis proceeds even if the destination location is ambiguous. However, the result can include endpoints that you don&#39;t intend to test.
     * 
     */
    @Import(name="destination", required=true)
    private Output<EndpointArgs> destination;

    public Output<EndpointArgs> destination() {
        return this.destination;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Unique name of the resource using the form: `projects/{project_id}/locations/global/connectivityTests/{test_id}`
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * IP Protocol of the test. When not provided, &#34;TCP&#34; is assumed.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Other projects that may be relevant for reachability analysis. This is applicable to scenarios where a test can cross project boundaries.
     * 
     */
    @Import(name="relatedProjects")
    private @Nullable Output<List<String>> relatedProjects;

    public Optional<Output<List<String>>> relatedProjects() {
        return Optional.ofNullable(this.relatedProjects);
    }

    /**
     * Source specification of the Connectivity Test. You can use a combination of source IP address, virtual machine (VM) instance, or Compute Engine network to uniquely identify the source location. Examples: If the source IP address is an internal IP address within a Google Cloud Virtual Private Cloud (VPC) network, then you must also specify the VPC network. Otherwise, specify the VM instance, which already contains its internal IP address and VPC network information. If the source of the test is within an on-premises network, then you must provide the destination VPC network. If the source endpoint is a Compute Engine VM instance with multiple network interfaces, the instance itself is not sufficient to identify the endpoint. So, you must also specify the source IP address or VPC network. A reachability analysis proceeds even if the source location is ambiguous. However, the test result may include endpoints that you don&#39;t intend to test.
     * 
     */
    @Import(name="source", required=true)
    private Output<EndpointArgs> source;

    public Output<EndpointArgs> source() {
        return this.source;
    }

    @Import(name="testId", required=true)
    private Output<String> testId;

    public Output<String> testId() {
        return this.testId;
    }

    private ConnectivityTestArgs() {}

    private ConnectivityTestArgs(ConnectivityTestArgs $) {
        this.description = $.description;
        this.destination = $.destination;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.protocol = $.protocol;
        this.relatedProjects = $.relatedProjects;
        this.source = $.source;
        this.testId = $.testId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectivityTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectivityTestArgs $;

        public Builder() {
            $ = new ConnectivityTestArgs();
        }

        public Builder(ConnectivityTestArgs defaults) {
            $ = new ConnectivityTestArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder destination(Output<EndpointArgs> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(EndpointArgs destination) {
            return destination(Output.of(destination));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder relatedProjects(@Nullable Output<List<String>> relatedProjects) {
            $.relatedProjects = relatedProjects;
            return this;
        }

        public Builder relatedProjects(List<String> relatedProjects) {
            return relatedProjects(Output.of(relatedProjects));
        }

        public Builder relatedProjects(String... relatedProjects) {
            return relatedProjects(List.of(relatedProjects));
        }

        public Builder source(Output<EndpointArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(EndpointArgs source) {
            return source(Output.of(source));
        }

        public Builder testId(Output<String> testId) {
            $.testId = testId;
            return this;
        }

        public Builder testId(String testId) {
            return testId(Output.of(testId));
        }

        public ConnectivityTestArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.testId = Objects.requireNonNull($.testId, "expected parameter 'testId' to be non-null");
            return $;
        }
    }

}
