// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs;
import com.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs;
import com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerState extends ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * Output only. The creation time.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The creation time.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Required. Destination specifies where the events should be sent to.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<TriggerDestinationArgs> destination;

    /**
     * @return Required. Destination specifies where the events should be sent to.
     * 
     */
    public Optional<Output<TriggerDestinationArgs>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
     * requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
     * requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    @Import(name="matchingCriterias")
    private @Nullable Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias;

    /**
     * @return Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    public Optional<Output<List<TriggerMatchingCriteriaArgs>>> matchingCriterias() {
        return Optional.ofNullable(this.matchingCriterias);
    }

    /**
     * Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @Import(name="transports")
    private @Nullable Output<List<TriggerTransportArgs>> transports;

    /**
     * @return Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    public Optional<Output<List<TriggerTransportArgs>>> transports() {
        return Optional.ofNullable(this.transports);
    }

    /**
     * Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
     * unchanged until the resource is deleted.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
     * unchanged until the resource is deleted.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * Output only. The last-modified time.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The last-modified time.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private TriggerState() {}

    private TriggerState(TriggerState $) {
        this.createTime = $.createTime;
        this.destination = $.destination;
        this.etag = $.etag;
        this.labels = $.labels;
        this.location = $.location;
        this.matchingCriterias = $.matchingCriterias;
        this.name = $.name;
        this.project = $.project;
        this.serviceAccount = $.serviceAccount;
        this.transports = $.transports;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerState $;

        public Builder() {
            $ = new TriggerState();
        }

        public Builder(TriggerState defaults) {
            $ = new TriggerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. The creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param destination Required. Destination specifies where the events should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<TriggerDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Required. Destination specifies where the events should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder destination(TriggerDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param etag Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
         * requests to ensure the client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
         * requests to ensure the client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param labels Optional. User labels attached to the triggers that can be used to group resources.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. User labels attached to the triggers that can be used to group resources.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param matchingCriterias Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
         * 
         * @return builder
         * 
         */
        public Builder matchingCriterias(@Nullable Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias) {
            $.matchingCriterias = matchingCriterias;
            return this;
        }

        /**
         * @param matchingCriterias Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
         * 
         * @return builder
         * 
         */
        public Builder matchingCriterias(List<TriggerMatchingCriteriaArgs> matchingCriterias) {
            return matchingCriterias(Output.of(matchingCriterias));
        }

        /**
         * @param matchingCriterias Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
         * 
         * @return builder
         * 
         */
        public Builder matchingCriterias(TriggerMatchingCriteriaArgs... matchingCriterias) {
            return matchingCriterias(List.of(matchingCriterias));
        }

        /**
         * @param name Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceAccount Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param transports Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
         * 
         * @return builder
         * 
         */
        public Builder transports(@Nullable Output<List<TriggerTransportArgs>> transports) {
            $.transports = transports;
            return this;
        }

        /**
         * @param transports Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
         * 
         * @return builder
         * 
         */
        public Builder transports(List<TriggerTransportArgs> transports) {
            return transports(Output.of(transports));
        }

        /**
         * @param transports Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
         * 
         * @return builder
         * 
         */
        public Builder transports(TriggerTransportArgs... transports) {
            return transports(List.of(transports));
        }

        /**
         * @param uid Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
         * unchanged until the resource is deleted.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
         * unchanged until the resource is deleted.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime Output only. The last-modified time.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The last-modified time.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public TriggerState build() {
            return $;
        }
    }

}
