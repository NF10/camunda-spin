/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.spin.json.mapping;

import java.util.List;

public class Order {

  private long id;
  private String order;
  private int dueUntil;
  private boolean active;
  private List<Customer> customers;
  private OrderDetails orderDetails;
  
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }
  public int getDueUntil() {
    return dueUntil;
  }
  public void setDueUntil(int dueUntil) {
    this.dueUntil = dueUntil;
  }
  public boolean isActive() {
    return active;
  }
  public void setActive(boolean active) {
    this.active = active;
  }
  public List<Customer> getCustomers() {
    return customers;
  }
  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }
  public OrderDetails getOrderDetails() {
    return orderDetails;
  }
  public void setOrderDetails(OrderDetails orderDetails) {
    this.orderDetails = orderDetails;
  }
}
