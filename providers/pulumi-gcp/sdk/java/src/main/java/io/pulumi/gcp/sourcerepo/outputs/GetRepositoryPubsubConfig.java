// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sourcerepo.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRepositoryPubsubConfig {
    private final String messageFormat;
    private final String serviceAccountEmail;
    private final String topic;

    @OutputCustomType.Constructor
    private GetRepositoryPubsubConfig(
        @OutputCustomType.Parameter("messageFormat") String messageFormat,
        @OutputCustomType.Parameter("serviceAccountEmail") String serviceAccountEmail,
        @OutputCustomType.Parameter("topic") String topic) {
        this.messageFormat = messageFormat;
        this.serviceAccountEmail = serviceAccountEmail;
        this.topic = topic;
    }

    public String getMessageFormat() {
        return this.messageFormat;
    }
    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryPubsubConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFormat;
        private String serviceAccountEmail;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryPubsubConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.topic = defaults.topic;
        }

        public Builder messageFormat(String messageFormat) {
            this.messageFormat = Objects.requireNonNull(messageFormat);
            return this;
        }

        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public GetRepositoryPubsubConfig build() {
            return new GetRepositoryPubsubConfig(messageFormat, serviceAccountEmail, topic);
        }
    }
}
