// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceReservationAffinitySpecificReservation {
    private final String key;
    private final List<String> values;

    @CustomType.Constructor
    private GetInstanceReservationAffinitySpecificReservation(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.values = values;
    }

    public String key() {
        return this.key;
    }
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceReservationAffinitySpecificReservation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceReservationAffinitySpecificReservation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetInstanceReservationAffinitySpecificReservation build() {
            return new GetInstanceReservationAffinitySpecificReservation(key, values);
        }
    }
}
