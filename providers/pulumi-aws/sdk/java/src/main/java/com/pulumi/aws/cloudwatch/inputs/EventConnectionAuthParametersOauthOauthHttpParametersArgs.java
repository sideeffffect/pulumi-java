// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs;
import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs;
import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersOauthOauthHttpParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthOauthHttpParametersArgs Empty = new EventConnectionAuthParametersOauthOauthHttpParametersArgs();

    /**
     * Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="bodies")
    private @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>> bodies;

    public Optional<Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>>> bodies() {
        return Optional.ofNullable(this.bodies);
    }

    /**
     * Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>> headers;

    public Optional<Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="queryStrings")
    private @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>> queryStrings;

    public Optional<Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>>> queryStrings() {
        return Optional.ofNullable(this.queryStrings);
    }

    private EventConnectionAuthParametersOauthOauthHttpParametersArgs() {}

    private EventConnectionAuthParametersOauthOauthHttpParametersArgs(EventConnectionAuthParametersOauthOauthHttpParametersArgs $) {
        this.bodies = $.bodies;
        this.headers = $.headers;
        this.queryStrings = $.queryStrings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventConnectionAuthParametersOauthOauthHttpParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventConnectionAuthParametersOauthOauthHttpParametersArgs $;

        public Builder() {
            $ = new EventConnectionAuthParametersOauthOauthHttpParametersArgs();
        }

        public Builder(EventConnectionAuthParametersOauthOauthHttpParametersArgs defaults) {
            $ = new EventConnectionAuthParametersOauthOauthHttpParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder bodies(@Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>> bodies) {
            $.bodies = bodies;
            return this;
        }

        public Builder bodies(List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs> bodies) {
            return bodies(Output.of(bodies));
        }

        public Builder bodies(EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs... bodies) {
            return bodies(List.of(bodies));
        }

        public Builder headers(@Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        public Builder queryStrings(@Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>> queryStrings) {
            $.queryStrings = queryStrings;
            return this;
        }

        public Builder queryStrings(List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs> queryStrings) {
            return queryStrings(Output.of(queryStrings));
        }

        public Builder queryStrings(EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs... queryStrings) {
            return queryStrings(List.of(queryStrings));
        }

        public EventConnectionAuthParametersOauthOauthHttpParametersArgs build() {
            return $;
        }
    }

}
