// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.eventarc.inputs.TriggerDestinationGetArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaGetArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerTransportGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerState extends io.pulumi.resources.ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * Output only. The creation time.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Required. Destination specifies where the events should be sent to.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<TriggerDestinationGetArgs> destination;

    public Input<TriggerDestinationGetArgs> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
     * requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    @InputImport(name="matchingCriterias")
      private final @Nullable Input<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias;

    public Input<List<TriggerMatchingCriteriaGetArgs>> getMatchingCriterias() {
        return this.matchingCriterias == null ? Input.empty() : this.matchingCriterias;
    }

    /**
     * Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @InputImport(name="transports")
      private final @Nullable Input<List<TriggerTransportGetArgs>> transports;

    public Input<List<TriggerTransportGetArgs>> getTransports() {
        return this.transports == null ? Input.empty() : this.transports;
    }

    /**
     * Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
     * unchanged until the resource is deleted.
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    /**
     * Output only. The last-modified time.
     * 
     */
    @InputImport(name="updateTime")
      private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public TriggerState(
        @Nullable Input<String> createTime,
        @Nullable Input<TriggerDestinationGetArgs> destination,
        @Nullable Input<String> etag,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<List<TriggerTransportGetArgs>> transports,
        @Nullable Input<String> uid,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.destination = destination;
        this.etag = etag;
        this.labels = labels;
        this.location = location;
        this.matchingCriterias = matchingCriterias;
        this.name = name;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.transports = transports;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    private TriggerState() {
        this.createTime = Input.empty();
        this.destination = Input.empty();
        this.etag = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.matchingCriterias = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.serviceAccount = Input.empty();
        this.transports = Input.empty();
        this.uid = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<TriggerDestinationGetArgs> destination;
        private @Nullable Input<String> etag;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<List<TriggerTransportGetArgs>> transports;
        private @Nullable Input<String> uid;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.matchingCriterias = defaults.matchingCriterias;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transports = defaults.transports;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder destination(@Nullable Input<TriggerDestinationGetArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable TriggerDestinationGetArgs destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder matchingCriterias(@Nullable Input<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias) {
            this.matchingCriterias = matchingCriterias;
            return this;
        }

        public Builder matchingCriterias(@Nullable List<TriggerMatchingCriteriaGetArgs> matchingCriterias) {
            this.matchingCriterias = Input.ofNullable(matchingCriterias);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder serviceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder transports(@Nullable Input<List<TriggerTransportGetArgs>> transports) {
            this.transports = transports;
            return this;
        }

        public Builder transports(@Nullable List<TriggerTransportGetArgs> transports) {
            this.transports = Input.ofNullable(transports);
            return this;
        }

        public Builder uid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public Builder updateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public TriggerState build() {
            return new TriggerState(createTime, destination, etag, labels, location, matchingCriterias, name, project, serviceAccount, transports, uid, updateTime);
        }
    }
}
