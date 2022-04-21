// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.enums.ServiceCorrelationScheme;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Creates a particular correlation between services.
 * 
 */
public final class ServiceCorrelationDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCorrelationDescriptionArgs Empty = new ServiceCorrelationDescriptionArgs();

    /**
     * The ServiceCorrelationScheme which describes the relationship between this service and the service specified via ServiceName.
     * 
     */
    @Import(name="scheme", required=true)
    private Output<Either<String,ServiceCorrelationScheme>> scheme;

    public Output<Either<String,ServiceCorrelationScheme>> scheme() {
        return this.scheme;
    }

    /**
     * The name of the service that the correlation relationship is established with.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ServiceCorrelationDescriptionArgs() {}

    private ServiceCorrelationDescriptionArgs(ServiceCorrelationDescriptionArgs $) {
        this.scheme = $.scheme;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCorrelationDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCorrelationDescriptionArgs $;

        public Builder() {
            $ = new ServiceCorrelationDescriptionArgs();
        }

        public Builder(ServiceCorrelationDescriptionArgs defaults) {
            $ = new ServiceCorrelationDescriptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder scheme(Output<Either<String,ServiceCorrelationScheme>> scheme) {
            $.scheme = scheme;
            return this;
        }

        public Builder scheme(Either<String,ServiceCorrelationScheme> scheme) {
            return scheme(Output.of(scheme));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServiceCorrelationDescriptionArgs build() {
            $.scheme = Objects.requireNonNull($.scheme, "expected parameter 'scheme' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
