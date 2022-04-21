// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs;
import com.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs;
import com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Required. Destination specifies where the events should be sent to.
     * 
     */
    @Import(name="destination", required=true)
    private Output<TriggerDestinationArgs> destination;

    public Output<TriggerDestinationArgs> destination() {
        return this.destination;
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    @Import(name="matchingCriterias", required=true)
    private Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias;

    public Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias() {
        return this.matchingCriterias;
    }

    /**
     * Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @Import(name="transports")
    private @Nullable Output<List<TriggerTransportArgs>> transports;

    public Optional<Output<List<TriggerTransportArgs>>> transports() {
        return Optional.ofNullable(this.transports);
    }

    private TriggerArgs() {}

    private TriggerArgs(TriggerArgs $) {
        this.destination = $.destination;
        this.labels = $.labels;
        this.location = $.location;
        this.matchingCriterias = $.matchingCriterias;
        this.name = $.name;
        this.project = $.project;
        this.serviceAccount = $.serviceAccount;
        this.transports = $.transports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerArgs $;

        public Builder() {
            $ = new TriggerArgs();
        }

        public Builder(TriggerArgs defaults) {
            $ = new TriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<TriggerDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(TriggerDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder matchingCriterias(Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias) {
            $.matchingCriterias = matchingCriterias;
            return this;
        }

        public Builder matchingCriterias(List<TriggerMatchingCriteriaArgs> matchingCriterias) {
            return matchingCriterias(Output.of(matchingCriterias));
        }

        public Builder matchingCriterias(TriggerMatchingCriteriaArgs... matchingCriterias) {
            return matchingCriterias(List.of(matchingCriterias));
        }

        public Builder name(@Nullable Output<String> name) {
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

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder transports(@Nullable Output<List<TriggerTransportArgs>> transports) {
            $.transports = transports;
            return this;
        }

        public Builder transports(List<TriggerTransportArgs> transports) {
            return transports(Output.of(transports));
        }

        public Builder transports(TriggerTransportArgs... transports) {
            return transports(List.of(transports));
        }

        public TriggerArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.matchingCriterias = Objects.requireNonNull($.matchingCriterias, "expected parameter 'matchingCriterias' to be non-null");
            return $;
        }
    }

}
