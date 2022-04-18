// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An entry for an Access Control list.
 * 
 */
public final class AclEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclEntryArgs Empty = new AclEntryArgs();

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> expirationTime() {
        return this.expirationTime == null ? Codegen.empty() : this.expirationTime;
    }

    /**
     * This is always `sql#aclEntry`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Optional. A label to identify this entry.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The allowlisted value for the access control list.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public AclEntryArgs(
        @Nullable Output<String> expirationTime,
        @Nullable Output<String> kind,
        @Nullable Output<String> name,
        @Nullable Output<String> value) {
        this.expirationTime = expirationTime;
        this.kind = kind;
        this.name = name;
        this.value = value;
    }

    private AclEntryArgs() {
        this.expirationTime = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AclEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Codegen.ofNullable(expirationTime);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public AclEntryArgs build() {
            return new AclEntryArgs(expirationTime, kind, name, value);
        }
    }
}
