// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetTargetGroupStickiness extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetGroupStickiness Empty = new GetTargetGroupStickiness();

    @Import(name="cookieDuration", required=true)
      private final Integer cookieDuration;

    public Integer cookieDuration() {
        return this.cookieDuration;
    }

    @Import(name="cookieName", required=true)
      private final String cookieName;

    public String cookieName() {
        return this.cookieName;
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GetTargetGroupStickiness(
        Integer cookieDuration,
        String cookieName,
        Boolean enabled,
        String type) {
        this.cookieDuration = Objects.requireNonNull(cookieDuration, "expected parameter 'cookieDuration' to be non-null");
        this.cookieName = Objects.requireNonNull(cookieName, "expected parameter 'cookieName' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetTargetGroupStickiness() {
        this.cookieDuration = null;
        this.cookieName = null;
        this.enabled = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupStickiness defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cookieDuration;
        private String cookieName;
        private Boolean enabled;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupStickiness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieDuration = defaults.cookieDuration;
    	      this.cookieName = defaults.cookieName;
    	      this.enabled = defaults.enabled;
    	      this.type = defaults.type;
        }

        public Builder cookieDuration(Integer cookieDuration) {
            this.cookieDuration = Objects.requireNonNull(cookieDuration);
            return this;
        }
        public Builder cookieName(String cookieName) {
            this.cookieName = Objects.requireNonNull(cookieName);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTargetGroupStickiness build() {
            return new GetTargetGroupStickiness(cookieDuration, cookieName, enabled, type);
        }
    }
}
