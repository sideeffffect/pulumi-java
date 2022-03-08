// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSecretSecret {
    private final @Nullable Map<String,String> context;
    private final @Nullable List<String> grantTokens;
    private final String name;
    private final String payload;

    @OutputCustomType.Constructor({"context","grantTokens","name","payload"})
    private GetSecretSecret(
        @Nullable Map<String,String> context,
        @Nullable List<String> grantTokens,
        String name,
        String payload) {
        this.context = context;
        this.grantTokens = grantTokens;
        this.name = name;
        this.payload = payload;
    }

    public Map<String,String> getContext() {
        return this.context == null ? Map.of() : this.context;
    }
    public List<String> getGrantTokens() {
        return this.grantTokens == null ? List.of() : this.grantTokens;
    }
    public String getName() {
        return this.name;
    }
    public String getPayload() {
        return this.payload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> context;
        private @Nullable List<String> grantTokens;
        private String name;
        private String payload;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.grantTokens = defaults.grantTokens;
    	      this.name = defaults.name;
    	      this.payload = defaults.payload;
        }

        public Builder setContext(@Nullable Map<String,String> context) {
            this.context = context;
            return this;
        }

        public Builder setGrantTokens(@Nullable List<String> grantTokens) {
            this.grantTokens = grantTokens;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPayload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }
        public GetSecretSecret build() {
            return new GetSecretSecret(context, grantTokens, name, payload);
        }
    }
}
