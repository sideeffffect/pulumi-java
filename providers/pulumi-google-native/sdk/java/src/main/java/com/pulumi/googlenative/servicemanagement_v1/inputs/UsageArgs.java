// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.UsageRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration controlling usage of a service.
 * 
 */
public final class UsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsageArgs Empty = new UsageArgs();

    /**
     * The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
     * 
     */
    @Import(name="producerNotificationChannel")
    private @Nullable Output<String> producerNotificationChannel;

    /**
     * @return The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
     * 
     */
    public Optional<Output<String>> producerNotificationChannel() {
        return Optional.ofNullable(this.producerNotificationChannel);
    }

    /**
     * Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example &#39;serviceusage.googleapis.com/billing-enabled&#39;. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include &#34;serviceusage.googleapis.com/tos/cloud&#34;. Other Google APIs should include &#34;serviceusage.googleapis.com/tos/universal&#34;. Additional ToS can be included based on the business needs.
     * 
     */
    @Import(name="requirements")
    private @Nullable Output<List<String>> requirements;

    /**
     * @return Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example &#39;serviceusage.googleapis.com/billing-enabled&#39;. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include &#34;serviceusage.googleapis.com/tos/cloud&#34;. Other Google APIs should include &#34;serviceusage.googleapis.com/tos/universal&#34;. Additional ToS can be included based on the business needs.
     * 
     */
    public Optional<Output<List<String>>> requirements() {
        return Optional.ofNullable(this.requirements);
    }

    /**
     * A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<UsageRuleArgs>> rules;

    /**
     * @return A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    public Optional<Output<List<UsageRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private UsageArgs() {}

    private UsageArgs(UsageArgs $) {
        this.producerNotificationChannel = $.producerNotificationChannel;
        this.requirements = $.requirements;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsageArgs $;

        public Builder() {
            $ = new UsageArgs();
        }

        public Builder(UsageArgs defaults) {
            $ = new UsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param producerNotificationChannel The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
         * 
         * @return builder
         * 
         */
        public Builder producerNotificationChannel(@Nullable Output<String> producerNotificationChannel) {
            $.producerNotificationChannel = producerNotificationChannel;
            return this;
        }

        /**
         * @param producerNotificationChannel The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
         * 
         * @return builder
         * 
         */
        public Builder producerNotificationChannel(String producerNotificationChannel) {
            return producerNotificationChannel(Output.of(producerNotificationChannel));
        }

        /**
         * @param requirements Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example &#39;serviceusage.googleapis.com/billing-enabled&#39;. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include &#34;serviceusage.googleapis.com/tos/cloud&#34;. Other Google APIs should include &#34;serviceusage.googleapis.com/tos/universal&#34;. Additional ToS can be included based on the business needs.
         * 
         * @return builder
         * 
         */
        public Builder requirements(@Nullable Output<List<String>> requirements) {
            $.requirements = requirements;
            return this;
        }

        /**
         * @param requirements Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example &#39;serviceusage.googleapis.com/billing-enabled&#39;. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include &#34;serviceusage.googleapis.com/tos/cloud&#34;. Other Google APIs should include &#34;serviceusage.googleapis.com/tos/universal&#34;. Additional ToS can be included based on the business needs.
         * 
         * @return builder
         * 
         */
        public Builder requirements(List<String> requirements) {
            return requirements(Output.of(requirements));
        }

        /**
         * @param requirements Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example &#39;serviceusage.googleapis.com/billing-enabled&#39;. For Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must include &#34;serviceusage.googleapis.com/tos/cloud&#34;. Other Google APIs should include &#34;serviceusage.googleapis.com/tos/universal&#34;. Additional ToS can be included based on the business needs.
         * 
         * @return builder
         * 
         */
        public Builder requirements(String... requirements) {
            return requirements(List.of(requirements));
        }

        /**
         * @param rules A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<UsageRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<UsageRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
         * 
         * @return builder
         * 
         */
        public Builder rules(UsageRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public UsageArgs build() {
            return $;
        }
    }

}
