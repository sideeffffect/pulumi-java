// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerDestinationCloudRunServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerDestinationCloudRunServiceArgs Empty = new TriggerDestinationCloudRunServiceArgs();

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Required. The region the Cloud Run service is deployed in.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Required. The name of the Cloud Run service being addressed. See https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services. Only services located in the same project of the trigger object can be addressed.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    private TriggerDestinationCloudRunServiceArgs() {}

    private TriggerDestinationCloudRunServiceArgs(TriggerDestinationCloudRunServiceArgs $) {
        this.path = $.path;
        this.region = $.region;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerDestinationCloudRunServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerDestinationCloudRunServiceArgs $;

        public Builder() {
            $ = new TriggerDestinationCloudRunServiceArgs();
        }

        public Builder(TriggerDestinationCloudRunServiceArgs defaults) {
            $ = new TriggerDestinationCloudRunServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public TriggerDestinationCloudRunServiceArgs build() {
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
